package Simple_Programs;

import java.util.Scanner;

public class CompositeNumber {
	
	int num;
	int flag =0;
	Scanner sc = new Scanner(System.in);
	
	public void input(){
		System.out.println("Enter a number:");
		num=sc.nextInt();
	}
	
	public void process(){
		if(num<1){
			flag = -1;
			System.out.println("Invlid Input Enter positive number:");
		}
		if(num == 0 || num == 1){
			System.out.println("Neither Composite nor prime");
		}
		else{
			for(int i=2; i<=num/2; i++){
				if(num%i == 0){
					flag = 1;
					break;
				}
			}
			if(flag == 1)
				System.out.println(num+"Is a Composite no.");
			if(flag == 0)
				System.out.println(num+"Not a Composite");
		}
	}

	public static void main(String [] args){
		CompositeNumber p = new CompositeNumber(); 
		p.input();
		p.process();
	}
	
}
