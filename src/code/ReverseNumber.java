package code;

import java.util.Scanner;
/*
Program 02: Reverse A Number
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse:");
        int num=scanner.nextInt();

/*
        int rev=0;
        while(num!=0)
        {
            rev = rev*10 + num % 10;
            num = num/10;

        }
        System.out.println("Reversed number: "+rev);
*/
        //Using StringBuffer class
/*
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("Reversed number: "+rev);
*/

//Using StringBuilder class

        StringBuilder sb=new StringBuilder(String.valueOf(num));
        StringBuilder rev=sb.reverse();
        System.out.println("Reversed number: "+rev);
    }
}
