package JavaQues1;

import java.util.stream.IntStream;

//Print all the numbers between  -15 to 10.
//2:  Ask user to enter a number and then print the multiplication table of the input number.
public class QuesThree {

	public static void main(String[] args) {

   
  // for (int i=-15; i<=10;i++) {
		IntStream num=IntStream.rangeClosed(-15, 11);
		 num.forEach( System.out::println );
		
	 //  System.out.println(num);
 //  }

	}

}
