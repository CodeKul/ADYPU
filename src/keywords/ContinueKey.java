package keywords;

public class ContinueKey {


    public static void main(String[] args) {

        StaticKey staticKey=new StaticKey();
        for (int i=0;i<6;i++){

            if (i==3){
              continue;
                //  break;
            }
            System.out.println(i);

        }

    }

}
