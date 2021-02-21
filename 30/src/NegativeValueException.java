public class NegativeValueException extends Exception{
    public NegativeValueException(){}
    public NegativeValueException(String msg){
        super(msg);
    }

    public void printMsg(){
        System.out.println(this.getMessage());
    }
}
