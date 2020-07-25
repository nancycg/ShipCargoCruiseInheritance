
**Design a Ship class that has the following members**

	•Name The Name field references a String object that holds the name of the ship.
	•Year The Year field is an int variable that holds the year the ship was built.
	•A constructor that accepts both fields
	•A constructor that accepts the name,and defaults to year=2005
	•A print method that displays name and year built.
	•A setYear method that sets the year to an int parameter

**Design a CruiseShip class that extends the Ship Class that has the following members**

	•maxPass The maxPass field references an int variable that holds the maximum passengers it can carry.
	•A constructor that accepts name, year built, and maximum passengers.
	•A constructor that acceptsthe name and defaults to 200 passengers.
	•A print method that displays name, year built, and maximum passengers

**Design a CargoShip class that extends the Ship Class that has the following members**

	•capacity The capacity field references an int variable that holds the maximum freight tonnage it can carry.
	•A constructor that accepts name, year built, and maximum capacity..
	•A print method that displays name, year built, and capacity

**The main method will have these calls**

	Ship base = new Ship("USS Base", 1967);
	base.print();
	Cruiseship cruise1=new Cruiseship("Concordia",2004,250);
	cruise1.print();
	Cargoship shipper = new Cargoship("USS Frieghter", 1988,500);
	shipper.print();
	Cruiseship cruise2=new Cruiseship("Roman Holiday");
	cruise2.print();
	shipper.setYear(2013);
	shipper.print();

And produces this output like this...

# OUTPUT
![](https://github.com/nancycg/ShipCargoCruiseInheritance/blob/master/resource/ExceptedOutput.png)