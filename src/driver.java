/**
 * This is driver class holding main method which is a entry
 * point of the program.
 */
public class driver {
	public static void main(String[] args) {
		Ship base = new Ship("USS Base", 1967);
		base.print();
		CruiseShip cruise1 = new CruiseShip("Concordia", 2004, 250);
		cruise1.print();
		CargoShip shipper = new CargoShip("USS Frieghter", 1988, 500);
		shipper.print();
		CruiseShip cruise2 = new CruiseShip("Roman Holiday");
		cruise2.print();
		shipper.setYear(2013);
		shipper.print();

	}
}
