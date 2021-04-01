package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i = 1;
		int total = 1;
		while(i<=no)
		{
	    total = total*i;
		i++;
		}
		System.out.println(total);
		}

}
