package JavaQues1;
// Abstract class
abstract class Animalpets {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pigp extends Animalpets {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}


public class abstractC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pigp myPig = new Pigp(); // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}


