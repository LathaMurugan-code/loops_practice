package practice;

import java.util.Scanner;

public class Addnos {

	public static void main(String[] args) {
		
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i = 0;
		int total =0;
		while(i<=no)
		{
	    total = total+i;
		i++;
		}
		System.out.println(total);
		}

}
