// Factory Pattern - Is Creational Design Pattern 

// parent class
 abstract class Vehicle{
	
	public abstract int getWheels();
	
	public String toString() {
		return "wheel : " + this.getWheels();
	}
}
 
 // child cass 1
class Car extends Vehicle{
	int wheel;
	
	Car(int wheel) {
		this.wheel = wheel;
	}
	
	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return this.wheel;
	}
	
}

// child class 2
class Bike extends Vehicle {

	int wheel;

	Bike(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getWheels() {
		
		return this.wheel;
	}

}

// 
class Factory {
	
	// static method - returns demanded child class object by user
	public static Vehicle getInstance(String vehicleType , int wheels) {
		
		if(vehicleType.equalsIgnoreCase("car")) {
			return new Car(wheels);
		}else if (vehicleType.equalsIgnoreCase("bike")) {
			return new Bike(wheels);
		}
		  return null;
	} 
}





public class FactoryPatternExample {

	public static void main(String[] args) {
		
		// user just provides type of vehicle/object (which child object ) want to created...
		// Factory class creates respectiv object based on user demanded object 
		Vehicle v1 = Factory.getInstance("bike", 2);
		System.out.println(v1);
		
		Vehicle v2= Factory.getInstance("Car", 4);
		System.out.println(v1);
		
		Vehicle v3= Factory.getInstance("Auto", 3);
		System.out.println(v3);
	}

}
