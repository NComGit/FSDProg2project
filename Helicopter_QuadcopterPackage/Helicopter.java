package Helicopter_QuadcopterPackage;

import AirplanePackage.Airplane;

public class Helicopter extends Airplane { //A Helicopter is an Airplane that additionally has the following: a number of cylinders (int type), a creation year (int type), and a passenger capacity (int type).  

	private int cylinders;
	private int creationYear;
	private int passengerCapacity;
	
	//initializing attributes with valid values using constructor - by default constructor
	public Helicopter() {
		//System.out.println("Helicopter created by default constructor.");
		super();
		this.cylinders = 54;
		this.creationYear = 2020;
		this.passengerCapacity = 400;
	}
	
	//initializing attributes with valid values using constructor - by parameter constructor
	public Helicopter(int c, int cy, int pc, String br, double pr, int hp) {
		//System.out.println("Helicopter created by parameter constructor.");
		super(br, pr, hp);
		this.cylinders = c;
		this.creationYear = cy;
		this.passengerCapacity = pc;
		
	}
	
	//initializing attributes with valid values using constructor - by copy constructor
	public Helicopter(Helicopter h) {
		//System.out.println("Helicopter created by copy constructor.");
		super(h);
		this.cylinders = h.cylinders;
		this.creationYear = h.creationYear;
		this.passengerCapacity = h.passengerCapacity;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public int getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return "Helicopter Cylinders: " + cylinders + " | Creation Year: " + creationYear + " | Passenger Capacity: "
				+ passengerCapacity + "|  Brand: " + getBrand() + " | Price: " + getPrice()
				+ " | Horsepower: " + getHorsePower();
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helicopter other = (Helicopter) obj;
		return creationYear == other.creationYear && cylinders == other.cylinders
				&& passengerCapacity == other.passengerCapacity;
	}
	
	
}
