package code;

import java.util.ArrayList;

public class OneisPresentinAnother {
    static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Ann");
        a1.add("Pat");
        a1.add("Java");
        System.out.println(a1);

        ArrayList<String> a2=new ArrayList<String>();
        a2.add("Ann");
        a2.add("Pat");
        a2.add("C++");
        a2.add("Java");
        System.out.println(a2);

        for(String s1: a1)
        {
            System.out.println(s1);
        }

        for(String s2: a2)
        {
            System.out.println(s2);
        }


    }
}
