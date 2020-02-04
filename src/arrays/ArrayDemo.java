package arrays;

public class ArrayDemo {
    void oneDArray(){
        int array[]={1,2,3,4,5};
        int array1[]=new int[5];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }

  /*  1 2 3
    4 5 6
    7 8 9*/

    void twoDArray(){
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<array.length;i++){
            for (int j=array.length-1;j>=0;j--){

                System.out.print(" "+array[i][j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayDemo demo=new ArrayDemo();
        demo.twoDArray();
    }
}

/*1 2 3
  4 5 6
  7 8 9

   3 2 1
   6 5 4
   9 8 7

   02 01 00
   12 11 10
   22 21 20

00 01 02
10 11 12
20 21 22*/
