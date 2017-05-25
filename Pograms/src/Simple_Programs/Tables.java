package Simple_Programs;
import java.util.Scanner;

public class Tables 
{
	public static void main(String[] args) 
	{
		long n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER: ");
		n = sc.nextLong();
		sc.close();
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(+n+" X "+i+" = "+(n*i));
			}
		}		
	}
}