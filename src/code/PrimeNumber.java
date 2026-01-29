package code;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Prime or Not:");
        int num=scanner.nextInt();
        int count=0;

        if(num>1)
        {
            for(int i=1; i<=num; i++)
            {
                if (num%i == 0)
                    count++;
            }
                if(count==2)
                {
                    System.out.println("Prime Number");
                }
                else {
                    System.out.println("Not a Prime Number");
                }
        }
        else {
            System.out.println("Not a Prime Number");
        }

    }
}
