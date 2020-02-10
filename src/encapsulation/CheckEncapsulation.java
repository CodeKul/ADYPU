package encapsulation;

import java.util.Scanner;

public class CheckEncapsulation {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int id=scanner.nextInt();
        String name=scanner.next();
        String address=scanner.next();


        EncapsulationDemo demo=new EncapsulationDemo();
        demo.setId(id);
        demo.setName(name);
        demo.setAddress(address);


        System.out.println("id : "+demo.getId()+"\n"+
                "name : "+demo.getName()+"\n"+
                "address : "+demo.getAddress()+"\n");

    }
}
