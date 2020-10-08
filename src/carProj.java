import JavaQues1.car;
import JavaQues1.vehicle;

public class carProj extends vehicle {

	
	private String modelName = "Mustang";
	  public static void main(String[] args) {
	    car myFastCar = new car();
	    myFastCar.honk();
	    myFastCar.setBrand("Lexus");
	    System.out.println(myFastCar.getBrand() + " " + myFastCar.modelName);
	    
	  }

}
