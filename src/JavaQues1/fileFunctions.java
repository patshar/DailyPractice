package JavaQues1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileFunctions {
	
	public static void fileCreate(){
		
		File myfile= new File("C:\\Users\\Pratima Sharma\\Documents\\filetext.xml");
		
		try {
		if (myfile.createNewFile())
		{
			System.out.println("File is created successfully");
		}
		else
		{
			System.out.println("file already exists");
		}
		}catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}
	
public static void fileWitee(){
	try {
		FileWriter myfile= new FileWriter("C:\\Users\\Pratima Sharma\\Documents\\filetext.xml");
		myfile.write("This is my first test file.");
		myfile.close();
		System.out.println("File is written successfully");
		
		}catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}
	
public static void fileRead(){
	try {
		File myfile= new File("C:\\Users\\Pratima Sharma\\Documents\\filetext.xml");
		Scanner str = new Scanner(myfile);
		while(str.hasNextLine()) {
			String cont=str.nextLine();
			System.out.println(cont);
		}
				
		}catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}

public static void GetFileInfo() { 
	    File myObj= new File("C:\\Users\\Pratima Sharma\\Documents\\filetext.xml");
	    if (myObj.exists()) {
	      System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	  
	}

public static void DeleteFile() {
	File myObj= new File("C:\\Users\\Pratima Sharma\\Documents\\filetext.txt");
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } 
	

	
	public static void main(String args[]) throws IOException {
		//fileCreate();
		
		//fileWitee();
		fileRead();
		GetFileInfo();
		//DeleteFile();
	}
}
