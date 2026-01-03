package code;
/*
Java Program 01: Swap Two Numbers | 5 Ways of swapping Numbers
 */
public class Swapping2Numbers {
    public static void main(String[] args){
        int a=10, b=20;

        //Logic: 1 Using 3rd variable
        /*
        System.out.println("Before swapping a =: "+a);
        System.out.println("Before swapping b =: "+b);
        int t=a;
        a=b;
        b=t;

        System.out.println("After swapping a =: "+a);
        System.out.println("After swapping b =: "+b);
        */

        //Logic : 2 using + & - operators without using 3rd variable

        /*
        System.out.println("Before swapping a =: "+a);
        System.out.println("Before swapping b =: "+b);

        a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20

        System.out.println("After swapping a =: "+a);
        System.out.println("After swapping b =: "+b);

         */
        //Logic : 3 using * & / operators without using 3rd variable, numbers should be non-zero
        /*
        System.out.println("Before swapping a =: "+a);
        System.out.println("Before swapping b =: "+b);

        a=a*b; //10*20=200
        b=a/b; //200/20=10
        a=a/b; //200/10=20

        System.out.println("After swapping a =: "+a);
        System.out.println("After swapping b =: "+b);
        */

        //Logic : 4 XOR Operator
        /*
        System.out.println("Before swapping a =: "+a);
        System.out.println("Before swapping b =: "+b);

        a=a^b; //10^20=30
        b=a^b; //30^20=10
        a=a^b; //30^10=20

        System.out.println("After swapping a =: "+a);
        System.out.println("After swapping b =: "+b);

         */

        //Logic : 5 Using single statement

        System.out.println("Before swapping a =: "+a);
        System.out.println("Before swapping b =: "+b);

        b=a+b-(a=b); // 10+20 - (20) Right to Left execution

        System.out.println("After swapping a =: "+a);
        System.out.println("After swapping b =: "+b);

    }

}
