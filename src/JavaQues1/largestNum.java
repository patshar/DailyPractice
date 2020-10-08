package JavaQues1;

public class largestNum {
	 public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {

		    	return 0;
		    }
		  }
	
	public static void main(String args[]) {
		
		int [] a= {10,20,-10,-20,2345,-1};
		double s= 1023456789.123456789000000001234567890234567896666d;
		float f= 4.123456789123456789123456789f;
		int j=1234567891;
		
		
		int smallest=a[0];
		int largest=a[0];
	
		for (int i=1; i < a.length; i++) {
			if (a[i]>largest)
				largest=a[i];
			else if (a[i]<smallest) {
				smallest=a[i];
			}
				
		}
		System.out.println("Largest number is :"+largest);
		System.out.println("Smallest number is :"+smallest);
		System.out.println("number is :"+s);
		
		
			    int result = sum(4);
			    System.out.println(result);
			  
			 
			
	}

}
