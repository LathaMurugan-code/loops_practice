package practice;

import java.util.Scanner;

public class NeonNumber
{
    // main method begins execution of this class
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;      // n for number to check neon or not
        int m;      // m for square of the n 
        int a;      // a for taking reminder 
        int s=0;    // for summation
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        m=n*n;      // Squaring of the number n
        while(m!=0)
        {
            a=m%10; // Calculating reminder
            s=s+a;  // adding the reminder to s
            m=m/10; // Integer division to truncate the last digit
        }
        if(s == n)  // Checking the original number to the summation
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }
    }
}
