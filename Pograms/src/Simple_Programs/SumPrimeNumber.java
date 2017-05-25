package Simple_Programs;

import java.util.Scanner;

public class SumPrimeNumber{
    public static void main(String args[])
    {
        int num, sum=0;
        System.out.print("Enter Range:");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println();
        for(int i=2;i<num;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    flag=1;
            }
            if(flag==0)
            {
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
