package JavaQues1;

public class vehicle {
	
		  protected String brand = "Ford";
		  public void honk() {
		    System.out.println("Tuut, tuut!");
		  
		}
		public final String getBrand() {
			System.out.println("getbrand");
			return brand;
		}
		public final void setBrand(String brand) {
			this.brand = brand;
		}
		

}
