package Simple_Programs;

import java.util.Scanner;

public class LeapYear {
	static int year;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter a Year:");
		year=sc.nextInt();
	}
	
	public void calculate(){
		if(year >0){
			if(year %4 == 0)
				System.out.println(year+"is a Leap Year");
			else
				System.out.println(year+"is not a leap Year");
		}else{
			System.out.println("invalid input Enter positive number:");
		}
	}

	public static void main(String args[])
	{
	 LeapYear	lp = new LeapYear();
	 lp.input();
	 lp.calculate();
	 
	}
}