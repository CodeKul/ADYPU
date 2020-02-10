package innerclasses;

import abstraction.AbstractDemo;

public class AnonymousInnerClass {

    public static void main(String[] args) {

        AbstractDemo demo=new AbstractDemo() {
            @Override
            public void showData() {

            }
        };


    }
}
