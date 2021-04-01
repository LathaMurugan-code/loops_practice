package practice;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any no");
		Scanner sc = new Scanner (System.in);
		int no = sc.nextInt();
		int i =2;
		int count = 0;
		while(i < no){
			if (no%i==0)
		    {
			System.out.println("Divisible by" + i);
			count++;
			 }
		 i++;  
		 //System.out.println(count);
		 }
		System.out.println(count);
	}

}
