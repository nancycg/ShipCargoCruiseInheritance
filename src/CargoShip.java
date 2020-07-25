/**
 * CargoShip is child class whose parent class is Ship.java
 */
public class CargoShip extends Ship {

	private int capacity;

	// A constructor that accepts name, year built, and maximum capacity
	public CargoShip(String name, int year, int capacity) {
		super(name, year); // passing values to super(parent) class i.e Ship
		this.capacity = capacity;
	}

	// A print method that displays name, year built, and capacity
	public void print() {
		System.out
				.println("CargoShip: " + this.name + " constructed in  " + this.year + ", can carry " + capacity + " tons");
	}

}
