package Simple_Programs;

public class HighestNumber {
	
	public static void main(String args [])
	{
		int numbers[]={102,7,8,2,1,45,66,88,99,110};
		int highest = 0;
		int second_highest = 0;
		
		for(int n:numbers)
		{
			if(highest <n)
			{
				second_highest = highest;
				highest = n;
			}else if(second_highest < n)
			{
				second_highest = n;
			}
		}
			System.out.println("First Max Number : "+highest);
			System.out.println("Second Max Number : "+second_highest);
	}

}
