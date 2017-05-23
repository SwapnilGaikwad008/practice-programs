package Simple_Programs;

import java.util.Scanner;
public class Area {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		
		int  i;
		System.out.println("Enter Your choice");
		System.out.println("1. Area of Square");
		System.out.println("2. Area of Rectangle");
		System.out.println("Area of Circle");
		
		i=sc.nextInt();
		Area am = new Area();

		switch (i) {
		case 1:
			am.areaSquare();
			break;

		case 2:
			am.areaRectangle();
			break;

		case 3:
			am.areaCircle();
			break;

		default:
			System.out.println("Invalid Input:");
			break;
		}
	}
	
	public void areaCircle(){
		System.out.println("Enter radius of circle: ");
		float radius = sc.nextFloat();
		float area = 3.1415F * radius *radius ;
		System.out.println("Area of Circle: "+area);
	}
	
	public void areaSquare(){
		System.out.println("Enter side of Square: ");
		float side = sc.nextFloat();
		float area = side * side;
		System.out.println("Area of Square: "+area);
	}
	
	public void areaRectangle(){
		System.out.println("Enter Length of Rectangle:");
		float length = sc.nextFloat();
		System.out.println("Enter Breadth of Rectangle: ");
		float breadth = sc.nextFloat();
		sc.close();
		float area = length * breadth;
		System.out.println("Area of Rectangle: ");
	}

}
