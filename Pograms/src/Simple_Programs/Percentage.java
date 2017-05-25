package Simple_Programs;

import java.util.Scanner;

public class Percentage {
	
	public static void main(String args[])
	{
		float p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage of student");
		p=sc.nextFloat();
		sc.close();
		
		if(p> 60 && p< 100)
			System.out.println("First Class");
		else if(p<60 && p>=45)
			System.out.println("Second Class");
		else if(p<45 && p>=35)
			System.out.println("Third class");
		else if(p<35)
			System.out.println("Fail");
		else
			System.out.print("Invalid Input");
		
	}

}