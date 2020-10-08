package JavaQues1;
//1: Print all the prime numbers of the given range i.e. Ask user to enter the starting number and ending number and Print all the prime numbers between starting and ending number. 

import java.util.Scanner;
import java.util.stream.IntStream;

public class QuesFive {

	public static void main(String [] args) {
				
		Scanner start= new Scanner(System.in);
		System.out.println("Enter Starting number of a range you want to print:");
		int num=start.nextInt();
		
		System.out.println("Enter Ending number of a range you want to print:");
		int numend=start.nextInt();
		System.out.println("Given numbers");
		IntStream n = IntStream.rangeClosed(num, numend);
		n.forEach(System.out::println);
		
		
		
	}
}
