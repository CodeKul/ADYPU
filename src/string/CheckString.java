package string;

public class CheckString {

    private String checkString(){
        String s="Java";
        for (int i=0;i<100000;i++){
            s=s.concat(" Training");
            //System.out.println(s);
        }

        return s;
    }

    private StringBuffer checkBuffer(){
        StringBuffer s=new StringBuffer("Java");
        for (int i=0;i<100000;i++){
            s.append(" Training");
            //System.out.println(s);
        }

        return s;
    }

    private StringBuilder checkBuilder(){
        StringBuilder s=new StringBuilder("Java");
        for (int i=0;i<100000;i++){
            s.append(" Training");
            //System.out.println(s);
        }

        return s;
    }

    public static void main(String[] args) {
        CheckString object=new CheckString();
        Long beforeStringTime=System.currentTimeMillis();
        object.checkString();
        System.out.println("time req of String : "
                +(System.currentTimeMillis()-beforeStringTime));

        Long beforeStringBufferTime=System.currentTimeMillis();
        object.checkBuffer();
        System.out.println("time req of String Buffer : "
                +(System.currentTimeMillis()-beforeStringBufferTime));

        Long beforeStringBuilderTime=System.currentTimeMillis();
        object.checkBuilder();
        System.out.println("time req of String Builder : "
                +(System.currentTimeMillis()-beforeStringBuilderTime));


    }

}
