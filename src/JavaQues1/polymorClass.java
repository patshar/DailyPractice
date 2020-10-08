package JavaQues1;


abstract class Animal {
	public  void animalcolor() {};
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	    int a=10;
	    int b= a+30;
	    System.out.println("sum: "+b);
	  }
}

class Pig extends Animal {
	  public void animalcolor() {
	    System.out.println("The pig says: wee wee");
	  }
	}

class Dog extends Animal {
	  public void animalcolor() {
	    System.out.println("The dog says: bow wow");
	  }
	}

class polymorClass {
	  public static void main(String[] args) {
		  
		  
		  Pig np= new Pig();
		  Dog dg= new Dog();
		  
		  np.animalcolor();
		  dg.animalcolor();
		  np.animalSound();
	    //Animal myAnimal = new Animal();
	   // Animal.Pig myPig = myAnimal.new Pig();
	  //  Animal.Dog myDog = myAnimal.new Dog();
	//    myAnimal.animalSound();
	    
	  
	    //Animal myDog = new Dog();
	        
	   // myAnimal.animalSound();
	//    myPig.animalSound();
	//    myDog.animalSound();
	  }
	}


