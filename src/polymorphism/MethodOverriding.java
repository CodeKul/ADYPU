package polymorphism;

public class MethodOverriding extends MethodOverLoading {

    void add(int a,int b){
        System.out.println("Overriding Addition : "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverriding overriding=new MethodOverriding();
        overriding.add(10,20);
    }

}
