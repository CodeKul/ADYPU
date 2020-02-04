package keywords;

public class StaticKey {

    static int count=0;

    public static void showData(){
        System.out.println(count);
        System.out.println("Inside static method");
    }

    public void getData(){
        System.out.println("Inside non-static method");

    }

    static {

        System.out.println("Inside static block");

    }


    public static void main(String[] args) {
       StaticKey staticKey=new StaticKey();
       staticKey.getData();
        showData();
    }

}
