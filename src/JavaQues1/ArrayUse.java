package JavaQues1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an Array ["A";"B";"C";"D";"E";"F";"G"]
//: Add item "NOW I KNOW MY ABCs" at the end. Output should be ["A";"B";"C";"D";"E";"F";"G";"NOW I KNOW MY ABCs"]
//2: Add item "123456" at the beginning. Output should be["123456";"A";"B";"C";"D";"E";"F";"G";"NOW I KNOW MY ABCs"]
//3: Remove ["D";"E";"F";"G"] from the array; Output should be ["123456";"A";"B";"C";"NOW I KNOW MY ABCs"]
//4: Remove ["123456"] from the array; Output should be ["A";"B";"C";"NOW I KNOW MY ABCs"]
//NOTE : Make sure the original array ["A";"B";"C";"D";"E";"F";"G"]should be intact and not modified. you can create any no. of new arrays.

public class ArrayUse {

	public static void main(String[] args) {
	
		List<String> al = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F")); 
		ArrayList<String> org= new ArrayList<String>();
		org.addAll(al);
		
		//for (int i=0; i <al.size(); i++) {
			  
		System.out.print(org);
		al.add(" NOW I KNOW MY ABCS");
		al.add(0,"12345 ");
		
		
		al.remove(4);
		al.remove(4);
		al.remove(4);
		
		
		//System.out.println("first: "+ aChar);
		
			//for (String i : al) {
			System.out.print(al);
			
System.out.println("The old list of array");
System.out.println(org);
	}

	
	}

