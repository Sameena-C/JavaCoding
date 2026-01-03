package code;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scanner.nextLine();
        String output="";

        for (int i=input.length()-1; i>=0; i--)
        {
            char c=input.charAt(i);
            output=output+c;
        }
        System.out.println("Given String: "+input);
        System.out.println("Reversed String: "+output);
        if(input.equals(output)==true)
        {
            System.out.println("Given String is a Palindrome");
        }
        else
        {
            System.out.println("Given String is not a Palindrome");
        }
    }
}
