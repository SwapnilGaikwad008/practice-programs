package Simple_Programs;

import java.util.Scanner;

public class Divisor {
	public static void main (String args[]){
	long num;
	int flag = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	num = sc.nextLong();
	sc.close();
	System.out.println("Divisor of "+num+"are:");
	for(int i=1; i<=num; i++)
	{
		if(num% i ==0)
		{
			flag++;
			System.out.println(i+"\t");
		}
	}
	System.out.println(num);
	System.out.println("Number of Divisors are ="+(flag+1));
	}
}
