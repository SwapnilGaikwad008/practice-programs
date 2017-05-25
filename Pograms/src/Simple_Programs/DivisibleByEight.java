package Simple_Programs;

public class DivisibleByEight {
	
	public static void main(String args[]){
		int i;
		int total =0;
		for(i=1; i<100; i++)
		{
			if(i%8 == 0){
				System.out.println(+i+"\t");
				total = total+i;   // will add all no divisible by 8
			}
		}
		System.out.println("\nTotal of all Divisible no: "+total);
	}

}