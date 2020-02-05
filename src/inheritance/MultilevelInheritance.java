package inheritance;

public class MultilevelInheritance extends SingleInheritance {

    int mul(int a,int b){
        return (a*b);
    }

    public static void main(String[] args) {
        MultilevelInheritance inheritance=new MultilevelInheritance();
        System.out.println("Addition : "+inheritance.add(20,10));
        System.out.println("Sub : "+inheritance.sub(20,10));
        System.out.println("mul : "+inheritance.mul(20,10));    }

}
