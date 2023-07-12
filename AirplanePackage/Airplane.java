package AirplanePackage;

public class Airplane { // An Airplane class, which has the following attributes: a brand (String type),
						// price (double type) and horsepower (int type).

	private String brand;
	private double price;
	private int horsepower;

	// initializing attributes with valid values using constructor - by default
	// constructor
	public Airplane() {
		// System.out.println("Airplane created by default constructor.");
		this.brand = "Embraer";
		this.price = 15413.33;
		this.horsepower = 123;
	}

	// initializing attributes with valid values using constructor - by parameter
	// constructor
	public Airplane(String br, double pr, int hp) {
		// System.out.println("Airplane created by parameter constructor.");
		this.brand = br;
		this.price = pr;
		this.horsepower = hp;

	}

	// initializing attributes with valid values using constructor - by copy
	// constructor
	public Airplane(Airplane a) {
		// System.out.println("Airplane created by copy constructor.");
		this.brand = a.brand;
		this.price = a.price;
		this.horsepower = a.horsepower;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getHorsePower() {
		return this.horsepower;
	}

	public void setHorsePower(int horsepower) {
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
		return "Airplane Brand: " + brand + " | Price: " + price + "$ | Horsepower : " + horsepower;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return brand == other.brand && horsepower == other.horsepower && price == other.price;
	}

}
