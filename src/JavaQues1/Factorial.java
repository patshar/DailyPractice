package JavaQues1;
// Ask user to enter a number and then print the factorial of the input number. example if user input 5, then print "factorial of 5 is = 120" i.e.  5*4*3*2*1

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		//Enter a number
		int fact = 1;
		Scanner num = new Scanner(System.in);
		System.out.println("To Find factorial of a given number, Enter the number");
		int n=num.nextInt();
		
		for(int i=n; i>=1; i--) {
			
		    fact *= i;
		}
		System.out.println("Factorial of "+ n + "is ="+ fact);

	}

}
