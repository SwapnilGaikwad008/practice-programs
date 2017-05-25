package Simple_Programs;

import java.util.Scanner;

public class SumOfDigits {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args)
	{
		int num, rem = 0 , sum=0;
		System.out.println("Enter a Number: ");
		num=sc.nextInt();
		
		while(num >0)
		{
			rem = num%10;
		    sum = sum+rem;
		    num = num/10;
	}
	System.out.println("Sum of the digits of Given Number ="+ sum);
}
}
