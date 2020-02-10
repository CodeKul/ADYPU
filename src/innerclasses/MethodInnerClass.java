package innerclasses;

public class MethodInnerClass {
    private int password=12345;
    void displayPrivateData(){

        class CheckMethodInnerClass{
            void showPassword(){
                System.out.println(password);
            }

        }

        CheckMethodInnerClass checkMethodInnerClass=new CheckMethodInnerClass();
        checkMethodInnerClass.showPassword();

    }

    public static void main(String[] args) {
        MethodInnerClass innerClass=new MethodInnerClass();
        innerClass.displayPrivateData();
    }
}
