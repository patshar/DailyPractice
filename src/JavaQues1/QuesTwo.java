package JavaQues1;
//Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
//Write a program to print below output

//Given String "abcd"  Output should print "efgh"

//Given String "xyz"   Output "abc"
public class QuesTwo {

	public static void convertUpper(String s) {
		String upper=s.toUpperCase();
		for(int i=0; i<s.length();i++) 
		    {
			System.out.print(upper.charAt(i));
			}
	}
	
	public static void deCode(String s) {
		String upper=s.toUpperCase();
		for(int i=0; i<s.length();i++) 
		    {
			
			int op=(int)(s.charAt(i));
			//System.out.println(op);
			if (op>119) 
				op=op-23;
			
			
			else {
				op=op+ 4;
			}
			System.out.print((char)op);
			}
	}
	
	private static int charAt(int i) {
		// TODO Auto-generated method tub
		return 0;
	}

	public static void main(String[] args) {
		
		convertUpper("ahceclwlxo");
		System.out.println("");
		deCode("xyz");
		System.out.println("");
		
		deCode("abcd");
	}
	

}
