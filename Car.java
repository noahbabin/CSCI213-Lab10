/**
 * Lab 10 Car class
 * @author Noah Babin
 *
 */
public class Car extends Vehicle {

	// an instance variable for the number of doors 
	// another for the number of passengers
	private int numDoors;
	private int numPassengers;
	
	// constructor that receives the make, model, plate, doors, 
	// and passengers and sets them appropriately
	public Car(String aMake, String aModel, String aPlate, int aNumDoors, int aNumPassengers) {
			super(aMake, aModel, aPlate);
			this.numDoors = aNumDoors;
			this.numPassengers = aNumPassengers;
		}
		
	// getter for number of doors
	public int getNumDoors(){
		return this.numDoors;
	}
	
	// getter for number of passengers
	public int getNumPassengers(){
		return this.numPassengers;
	}
	
	// toString
	@Override
	public String toString() {
		String result = String.format("%d-door %s", this.getNumDoors(), super.toString());
		return result;
	}
	
	// equals
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Car)) {
			return false;
		}
		Car otherCar = (Car) other;
		if (this.numDoors == otherCar.getNumDoors()){
			if (this.numPassengers == otherCar.getNumPassengers()){
				return super.equals(other);
			}
		}
		return false;
	}
	
	// copy
	public Car copy() {
		String make = this.getMake();
		String model = this.getModel();
		String plate = this.getPlate();
		int numDoors = this.getNumDoors();
		int numPassengers = this.getNumPassengers();
		// create and return a copy
		Car theCopy = new Car(make, model, plate, numDoors, numPassengers);
		return theCopy;
	}      
	
	// test each of these with a main
	public static void main(String[] args){
		//System.out.println("Hello");	
		String make = "subaru";
		String model = "baja";
		String plate = "123jk";
		Car newCar = new Car(make, model, plate, 4, 2);
		Car newCar2 = new Car("subaru", "baja", "123jk", 4,2);
		// Car copyCar = newCar.copy();
		int doorCount = newCar.getNumDoors();
		int passCount = newCar.getNumPassengers();
		System.out.printf("Door count:      %d%n", doorCount);
		System.out.printf("Passenger count: %d%n", passCount);	
		System.out.println(newCar.toString());
		System.out.println(newCar.equals(newCar2));	


	}

}