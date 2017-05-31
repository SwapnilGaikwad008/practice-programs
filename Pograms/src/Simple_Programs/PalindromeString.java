package Simple_Programs;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String args[])
	{
		String original ,reverse ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		original =sc.nextLine();
		sc.close();
		
		int length = original.length();
		for(int i= length - 1; i >=0 ; i--)
		
			reverse = reverse + original.charAt(i);
			if(original.equals(reverse))
				System.out.println("Entered String is Palindrome");
			else
			    System.out.println("Entered String is not a Palindrome");		
			
		
	}
			

}
