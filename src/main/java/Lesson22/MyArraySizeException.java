package Lesson22;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException (){
        super("array length exceeded");
    }
}
