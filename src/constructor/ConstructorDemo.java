package constructor;

import keywords.StaticKey;

public class ConstructorDemo {

   private ConstructorDemo(){
        //"DYPATILCOLLEGE"

        System.out.println("default Constructor");
    }

    ConstructorDemo(int a){
        System.out.println("Constructor : "+a);
    }


    public static void main(String[] args) {
        ConstructorDemo constructorDemo=new ConstructorDemo();
        StaticKey staticKey=new StaticKey();
        staticKey.getData();
        StaticKey.showData();
    }
}
