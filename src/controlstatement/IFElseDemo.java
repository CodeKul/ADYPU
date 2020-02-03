package controlstatement;

import java.util.Scanner;

public class IFElseDemo {
    //   int number;
    void checkIfElse(int number){

        if (number%2==0){
            System.out.println(number+" Even Number");
        }
        else {
            System.out.println(number+" Odd Number");
        }

    }


    public static void main(String[] args) {
        IFElseDemo demo=new IFElseDemo();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        demo.checkIfElse(number);
    }

}
