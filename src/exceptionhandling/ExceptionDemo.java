package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo {

    private void checkArithmeticException(){
        try {
            int a=0;
            int result=10/a;
            System.out.println("result : "+result);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }
        restOfTheCode();
    }

    private  void checkNullPointerException(){
        try {
            String s = null;
            int length = s.length();
            System.out.println(length);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Inside finally block");
        }
        restOfTheCode();
        }

        private void checkException() throws IOException {

            File file=new File("/home/rajan/Desktop/ADYPU");
            FileInputStream inputStream=new FileInputStream(file);
        }


    private void restOfTheCode(){
        throw new ArithmeticException("not allowed");
       // System.out.println("Rest of the code");
    }

    public static void main(String[] args) {

        ExceptionDemo demo=new ExceptionDemo();
        demo.restOfTheCode();
       /* try {
            demo.checkException();
        }
        catch (IOException e){

        }*/


    }

}
