package inheritance;

public class SingleInheritance extends Calculator {

    int sub(int a,int b){
        return (a-b);
    }

    public static void main(String[] args) {
        SingleInheritance inheritance=new SingleInheritance();
        System.out.println("Addition : "+inheritance.add(20,10));
        System.out.println("Sub : "+inheritance.sub(20,10));
    }

}
