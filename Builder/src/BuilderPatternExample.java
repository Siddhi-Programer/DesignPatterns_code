class Vehicle {

	// required parameter 
	private String engine;
	private int wheel;

	// optional parameter 
	private int airbags;
	
	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	public int getAirbags() {
		return airbags;
	}

	// private constructor 
	private Vehicle(VehicleBuilder vb) {
		this.engine = vb.engine;
		this.wheel = vb.wheel;
		this.airbags = vb.airbags;
	}

	// public static inner  Builder class  
	public static class VehicleBuilder {

		// required parameter 
		private String engine;
		private int wheel;

		// optional parameter
		private int airbags;

		// constructor with required parameter
	    public VehicleBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
			
		}

		// setter method for optional parameter 
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}

		// public method to return vehicle object 
		public Vehicle build() {
			 // private Vehicle constructor called...
			return new Vehicle(this);
		}

	}


}


public class BuilderPatternExample {

	public static void main(String[] args) {
		
		// client have to pass only required parameter while creating objects 
		// not optional parameters (optional parametrers can be added using setter method )
		
		Vehicle car =new  Vehicle.VehicleBuilder("1500cc",4).setAirbags(2).build();
		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());
		
		Vehicle bike = new Vehicle.VehicleBuilder("250cc",2).build();
		System.out.println("\n"+bike.getEngine());
		System.out.println(bike.getWheel());
		System.out.println(bike.getAirbags());
		
		

	}

}

/*
 * 1500cc 4 2
 * 
 * 250cc 2 0
 */

