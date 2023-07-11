package MultirotorPackage;

import Helicopter_QuadcopterPackage.Helicopter;

public class Multirotor extends Helicopter { //  that additionally has the following: number of rotors (int type), which indicates its number of rotors/blades that it has.  
	
	private int numberOfRotors;
	
	public Multirotor() {
		super();
	}

	public Multirotor(String brand, double price, int horsepower, int numCylinders, int yearCreation,
			int passengerCapacity, int numberOfRotors) {
		super(numCylinders, yearCreation, passengerCapacity, brand, price, horsepower);
		this.numberOfRotors = numberOfRotors;
	}

	public Multirotor(Multirotor quad) {
		super.setBrand(quad.getBrand());
		super.setPrice(quad.getPrice());
		super.setHorsePower(quad.getHorsePower());
		super.setCylinders(quad.getCylinders());
		super.setCreationYear(quad.getCreationYear());
		super.setPassengerCapacity(quad.getPassengerCapacity());
		this.numberOfRotors = quad.numberOfRotors;
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
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Multirotor other = (Multirotor) obj;
		
		return super.getCreationYear() == other.getCreationYear() && super.getCylinders() == other.getCylinders()
				&& super.getPassengerCapacity() == other.getPassengerCapacity()
				&& this.numberOfRotors == other.getNumberOfRotors();
	}


}
