/**
 * This is parent class.
 */
public class Ship {

    protected String name;
    protected int year;

    // A constructor that accepts both fields
    public Ship(String name, int year) {
        super();
        this.name = name;
        this.year = year;
    }

    // A constructor that accepts the name,set default value for year=2005
    public Ship(String name) {
        this(name, 2005);
    }

    // A setYear method that sets the year to an int parameter
    public void setYear(int year) {
        this.year = year;
    }

    // A print method that displays name and year built.
    public void print() {
        System.out.println("ship: " + this.name + " was built " + this.year);
    }
}
