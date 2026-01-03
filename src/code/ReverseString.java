package code;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scanner.nextLine();

        String output="";
         /*
        for(int i=input.length()-1; i>=0; i--)
        {
            char c=input.charAt(i);
            output=output+c;
        }
        System.out.println("Given String: "+input);
        System.out.println("Reversed String: "+output);

         */

        // Using toCharArray()
        /*
        char a[]=input.toCharArray();
        for(int i=input.length()-1; i>=0; i--)
        {
            output=output+a[i];
        }
        System.out.println("Given String: "+input);
        System.out.println("Reversed String: "+output);

         */
        //Using StringBuffer class
        /*
        StringBuffer sb=new StringBuffer(input);
        System.out.println("Given String: "+input);
        System.out.println("Reversed String: "+sb.reverse());
        */
        //Using StringBuilder class

        StringBuilder sb=new StringBuilder(input);
        System.out.println("Given String: "+input);
        System.out.println("Reversed String: "+sb.reverse());

    }
}
