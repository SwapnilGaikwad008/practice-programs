package Simple_Programs;

import java.util.Scanner;

public class PerfectNumber {
	
	int i , num ,total=0;
	Scanner sc = new Scanner(System.in);
	
	public void input(){
		System.out.println("Enter a Number:");
		num = sc.nextInt();
	}
	
	public void calculate(){
		for(i=1 ; i<=num; i++)
		{
			if(num% i == 0)
			{
				total = total+i;
			}
		}
	}
	
	public void checkPerfect(){
		if(total/2 == num)
			System.out.println(+num+"is a perfect Number");
		else
			System.out.println(+num+"is not a perfect Number");
	}

	public static void main(String args[]){
		PerfectNumber pn = new PerfectNumber();
		pn.input();
		pn.calculate();
		pn.checkPerfect();
	}
}
