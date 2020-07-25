/**
 * CruiseShip is child class whose parent class is Ship.java
 */
public class CruiseShip extends Ship {

	private int maxPass;

	// A constructor that accepts name, year built, and maximum passengers.
	public CruiseShip(String name, int year, int maxPass) {
		super(name, year); // passing values to super(parent) class i.e Ship
		this.maxPass = maxPass;
	}

	// A constructor that accepts the name and defaults to 200 passengers.
	public CruiseShip(String name) {
		super(name);  // passing values to super(parent) class i.e Ship
		this.maxPass = 200;
	}

	// A print method that displays name, year built, and maximum passengers
	public void print() {
		System.out.println(
				"CruiseShip: " + this.name + " constructed in  " + this.year + ", can carry " + maxPass + " passengers");
	}

}
