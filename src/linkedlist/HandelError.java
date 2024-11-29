package linkedlist;

public class HandelError {
    private HandelError(){}
    public static void handelError(Exception e){
        if(e instanceof NullPointerException){
            System.out.println("You access null");
        }else if(e instanceof ArrayIndexOutOfBoundsException){
            System.out.println("Out of bound");
        }else if(e instanceof ArithmeticException){
            System.out.println("not allowed div on zero");
        }
    }

}
