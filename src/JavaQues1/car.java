package JavaQues1;

public class car extends vehicle {

	
	public String modelName = "Mustang";
	  public static void main(String[] args) {
	    car myFastCar = new car();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }

	}

