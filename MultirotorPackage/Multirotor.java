package MultirotorPackage;

import Helicopter_QuadcopterPackage.Helicopter;

public class Multirotor extends Helicopter { // that additionally has the following: number of rotors (int type), which
												// indicates its number of rotors/blades that it has.

	private int numberOfRotors;

	public Multirotor() {
		super();
		numberOfRotors = 6;
	}

	public Multirotor(String brand, double price, int horsepower, int numCylinders, int yearCreation,
			int passengerCapacity, int numberOfRotors) {
		// Parameterized constructor; passes parameters, except numberOfRotors, to
		// parameterized constructor of Helicopter class
		super(numCylinders, yearCreation, passengerCapacity, brand, price, horsepower);
		this.numberOfRotors = numberOfRotors;
	}

	public Multirotor(Multirotor multi) {
		// Copy constructor; passes attributes of Multirotor multi(object to be copied)
		// to superclass of Multirotor object to be created
		super(multi);
		this.numberOfRotors = multi.numberOfRotors;
	}

	public int getNumberOfRotors() {
		return numberOfRotors;
	}

	public void setNumberOfRotors(int numberOfRotors) {
		this.numberOfRotors = numberOfRotors;
	}

	@Override
	public String toString() {
		return "Multirotor Brand: " + getBrand() + " | Price: " + getPrice() + " | Horsepower: " + getHorsePower()
				+ " | Number of Cylinders: " + getCylinders() + " | Passenger Capacity: " + getPassengerCapacity()
				+ " | Year of Creation: " + getCreationYear() + " | Number of rotors: " + numberOfRotors;
	}

	public boolean equals(Object obj) {
		// Compares to objects to see if their attributes are equal. First checks to see
		// if object has been passed to itself, then if objects are of the same class.
		// The objects attributes are then compared.
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;

		Multirotor other = (Multirotor) obj;

		return super.getCreationYear() == other.getCreationYear() && super.getCylinders() == other.getCylinders()
				&& super.getPassengerCapacity() == other.getPassengerCapacity()
				&& this.numberOfRotors == other.getNumberOfRotors() && super.getBrand() == other.getBrand();
	}

}
