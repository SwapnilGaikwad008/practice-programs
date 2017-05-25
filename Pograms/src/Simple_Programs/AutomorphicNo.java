package Simple_Programs;

import java.util.Scanner;

public class AutomorphicNo {
	
	public static void main (String args[]){
		 Integer n;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Check Automorphic no. or not: ");
		 n=sc.nextInt();
		 sc.close();
		 Integer sq = n*n;
		 
		 String num = Integer.toString(n);
		 String square = Integer.toString(sq);
		 if(square.endsWith(num))
			 System.out.println("It is a Automorphic no."+num);
			 else
				 System.out.println("It is not Automorphic no."+num);
	}

}
