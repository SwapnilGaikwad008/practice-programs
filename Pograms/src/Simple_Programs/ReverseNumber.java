package Simple_Programs;

import java.util.Scanner;

public class ReverseNumber {
	
	static int n;
	Scanner sc = new Scanner(System.in);
	
	public int input(){
		System.out.println("Enter digit no. ");
		n=sc.nextInt();
		return n;
	}
	
	public int reverse(){
		int rem, rev=0;
		int temp =n;
		while(temp != 0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		return rev;
	}
	
	public static void main(String args[]){
		ReverseNumber rn = new ReverseNumber();
		int x = rn.input();
		int y = rn.reverse();
		System.out.println("Reverse of n "+ x +" is "+ y);
	}

}
