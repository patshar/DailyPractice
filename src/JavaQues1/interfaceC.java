package JavaQues1;
//Interface
interface Animalint {
public void animalSound(); // interface method (does not have a body)
public void sleep(); // interface method (does not have a body)
}

interface Animalcolo{
	public void dogs();
	public void cats();
}

//Pig "implements" the Animal interface
class Pigint implements Animalint, Animalcolo {
	int x;
public Pigint() {
	 x=10;
	
	}
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}
public void sleep() {
 // The body of sleep() is provided here
 System.out.println("Zzz");
}
public void dogs() {
	 // The body of sleep() is provided here
	 System.out.println("Boo");
	}
public void cats() {
	 // The body of sleep() is provided here
	 System.out.println("meow");
	}
}

public class interfaceC {
	public static void main(String[] args) {
		 Pigint myPig = new Pigint();  // Create a Pig object
		 myPig.animalSound();
		 myPig.sleep();
		 myPig.cats();
		 myPig.dogs();
		 System.out.println(myPig.x);
		
		 
		}
}
