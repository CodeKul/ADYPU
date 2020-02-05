package polymorphism;

public class MethodOverriding extends MethodOverLoading {
    int a=200;

    public MethodOverriding() {
        super();
        System.out.println("Inside Child class constructor");
    }

    void add(int a, int b){
        System.out.println("Overriding Addition : "+(a+b));
    }

    void showData(){
        super.add(10,20);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        MethodOverriding overriding=new MethodOverriding();
        overriding.showData();
    }

}
