package Simple_Programs;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args[]){
		long a=0,b=1,c;
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Fibonacci Series");
		System.out.println("Enter no. of Elements needed:");
		n=sc.nextInt();
		sc.close();
		System.out.print(+a+"\t"+b+"\t");
		for(int i = 0;i<n-2; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
		}
	}

}