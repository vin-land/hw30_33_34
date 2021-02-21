import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] radiusArr = {3, -6, 11, -5, 22};
        int h = 11;
        ArrayList<Double> v = new ArrayList<>();
        for (int radius : radiusArr) {
            try {
                v.add(vCylinder(radius, h));
            }catch(NegativeValueException e){
                System.out.println("radius = " + radius+", height = "+h);
                e.printMsg();
            }
        }
    }


    public static double vCylinder(int radius,int height) throws NegativeValueException {
        if (radius<0 || height<0){
            throw new NegativeValueException("Values must be positive!");
        }else{
            return Math.PI*radius*radius*height;
        }
    }
}
