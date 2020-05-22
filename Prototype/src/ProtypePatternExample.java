import java.util.ArrayList;
import java.util.List;

// creational design pattern 
// use : instead of making changes in original object (keep it intact)
// clone it 
// and add  changes in new clonned object... 

class Vehicle implements Cloneable {
	private List<String> vehicleList;

	Vehicle() {
		this.vehicleList = new ArrayList<String>();
	}

	public Vehicle(List<String> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public List<String> getVehicleList() {
		return this.vehicleList;
	}

	public void insertVehicles() {

		vehicleList.add("Toyota");
		vehicleList.add("Swift");
		vehicleList.add("Maroti");
		vehicleList.add("Ferrari");

	}

	@Override
	public String toString() {
		return "Vehicle [vehicleList=" + vehicleList + ", getVehicleList()=" + getVehicleList() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ArrayList<String> tmpList = new ArrayList<String>();

		for (String string : vehicleList) {

			tmpList.add(string);
		}
		return new Vehicle(tmpList);
	}

}

public class ProtypePatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v = new Vehicle();
		v.insertVehicles();
		System.out.println(v);

		Vehicle newV = (Vehicle) v.clone();

		System.out.println(newV);

		ArrayList<String> newVehicleList = (ArrayList<String>) newV.getVehicleList();
		newV.getVehicleList().add("Mercedezzzz");
		newVehicleList.add("new_Car");

		System.out.println(newVehicleList);
		System.out.println(newV);

		System.out.println(v.getVehicleList());

	}

}

/*
Vehicle [vehicleList=[Toyota, Swift, Maroti, Ferrari], getVehicleList()=[Toyota, Swift, Maroti, Ferrari], getClass()=class Vehicle, hashCode()=366712642, toString()=Vehicle@15db9742]
Vehicle [vehicleList=[Toyota, Swift, Maroti, Ferrari], getVehicleList()=[Toyota, Swift, Maroti, Ferrari], getClass()=class Vehicle, hashCode()=1829164700, toString()=Vehicle@6d06d69c]
[Toyota, Swift, Maroti, Ferrari, Mercedezzzz, new_Car]
Vehicle [vehicleList=[Toyota, Swift, Maroti, Ferrari, Mercedezzzz, new_Car], getVehicleList()=[Toyota, Swift, Maroti, Ferrari, Mercedezzzz, new_Car], getClass()=class Vehicle, hashCode()=1829164700, toString()=Vehicle@6d06d69c]
[Toyota, Swift, Maroti, Ferrari]

*/