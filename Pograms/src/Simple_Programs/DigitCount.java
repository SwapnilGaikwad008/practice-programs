package Simple_Programs;

import java.util.Scanner;

public class DigitCount {
	
	public static void main(String args[])
	{
		int count = 0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Number");
		n= sc.nextInt();
		sc.close();
		while(n!=0)
		{
			count ++;
			n/=10;
		}
		System.out.println("count = "+count);
	}

}
