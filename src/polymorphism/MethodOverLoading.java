package polymorphism;

public class MethodOverLoading {

    MethodOverLoading(){

    }

    MethodOverLoading(int a){

    }


    void add(int a,int b){
        System.out.println("Overloading Addition : "+(a+b));
    }

    void add(float a,int b){
        System.out.println("Addition : "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverLoading overLoading=new MethodOverLoading();
        overLoading.add(1F,2);
    }
}
