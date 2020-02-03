package controlstatement;

public class Loops {

    void executeForLoop(){

        for (int i=0;i<3;i++){

            for (int j=0;j<3;++j){
                System.out.println(i+""+j);
            }

        }


    }

    void whileLoop(){

        int i=0;
        while (i<3){
            System.out.println("while : "+i);
            i++;
        }

        do {
            System.out.println("do while : "+i);
        }while (i<3);

    }


    public static void main(String[] args) {
       /* int a=10;
        int b=a++;//b=10 a=11
        int c=(a++)+(++b);//c=22 b=11 a=12
        int d=(++a)+(b++)+(++c);//d=47 c=23 b=12 a=13
        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
        System.out.println("d "+d);*/

       Loops loops=new Loops();
       loops.whileLoop();
    }


}
