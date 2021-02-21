import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer min=60,hour=min*60,day=hour*24,week=day*7,month=day*30;
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(hour,min,day,month,week));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("sort "+numbers);

        int bin = Collections.binarySearch(numbers,hour);
        System.out.println("position_hour: "+bin);

        Collections.reverse(numbers);
        System.out.println("reverse "+numbers);

        Collections.shuffle(numbers);
        int maxi=Collections.max(numbers);
        int mini=Collections.min(numbers);
        System.out.println("shuffle "+numbers);
        System.out.println("max = "+maxi);
        System.out.println("min = "+mini);
        Collections.fill(numbers,42);
        System.out.println("fill "+numbers);
    }
}
