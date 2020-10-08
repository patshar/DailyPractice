package JavaQues1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Starting number of a range");
		int s = num.nextInt();
		
		System.out.println("Enter Ending number of a range");
		int e = num.nextInt();
		
		for (int i=s; i<=e; i++)
		{
			int flag=0;		
				for (int j=2; j<=i;j++) 
				{
					
					if ((i!=j) && (i%j == 0))
					{
						flag=1;
						
					}
					
					
				}
					
			   if (flag==0)
				   System.out.println(i+" is a prime number");
				
				
		}
		

}
}
