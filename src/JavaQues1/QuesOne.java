package JavaQues1;
//Print HELLO for the given string "AHCECLWLXO" 
public class QuesOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str= "AHCECLWLXO";
	
		// Printing content of array 
  
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)=='H' ||str.charAt(i)=='E'||str.charAt(i)=='L'||str.charAt(i)=='L'||str.charAt(i)=='O')
				System.out.print(str.charAt(i));
			
		}
		
	}

	
}