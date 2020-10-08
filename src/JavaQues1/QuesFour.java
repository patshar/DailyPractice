package JavaQues1;

import java.util.Scanner;

public class QuesFour {

	public static void main(String[] args) {
		//input a num
		Scanner n= new Scanner(System.in);
		System.out.println("Which table you want to display: ");
		int num=n.nextInt();
		for(int i=1; i<=10;i++) {
			System.out.println(num+ " * " +i +"="+ (num * i));
		}
		

	}

}
