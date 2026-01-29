package code;

import java.util.Arrays;

public class Interview1 {
    static void main(String[] args) {
        String a="abcxyzbbttbcyybbxzaca";
        char ch[]=a.toCharArray();
        System.out.println(Arrays.toString(ch));

//        for(int i=0; i<ch.length; i++)
//        {
//            if(ch[i] == 'x' || ch[i] == 'y' || ch[i] == 'z' || ch[i] == 't')
//            {
//                continue;

                System.out.println(a.replaceAll("[txyz]", " "));
           // }
           // System.out.print(ch[i]);
       // }



    }
}
