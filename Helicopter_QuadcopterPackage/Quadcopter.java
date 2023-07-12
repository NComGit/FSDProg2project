package Helicopter_QuadcopterPackage;

public class Quadcopter extends Helicopter { // A Quadcopter, is a Helicopter that additionally has the following: max
												// flying speed (int type), which indicates its maximum moving speed.
	private int maxFlyingSpeed;

	public Quadcopter() {
		// Default constructor; passes to default constructor of Helicopter class
		super();
		maxFlyingSpeed = 100000;
	}

	public Quadcopter(String brand, double price, int horsepower, int numCylinders, int yearCreation,
			int passengerCapacity, int maxFlyingSpeed) {
		// Parameterized constructor; passes parameters, except maxFlyingSpeed, to
		// parameterized constructor of Helicopter class
		super(numCylinders, yearCreation, passengerCapacity, brand, price, horsepower);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	public Quadcopter(Quadcopter quad) {
		// Copy constructor; passes attributes of Quadcopter quad(object to be copied)
		// to superclass of Quadcopter object to be created
		super(quad);
		this.maxFlyingSpeed = quad.maxFlyingSpeed;
	}

	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}

	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	@Override
	public String toString() {
		return "Quadcopters Brand: " + getBrand() + " | Price: " + getPrice() + " | Horsepower: " + getHorsePower()
				+ " | Number of Cylinders: " + getCylinders() + " | Passenger Capacity: " + getPassengerCapacity()
				+ " | Year of Creation: " + getCreationYear() + " | Max Flying Speed: " + maxFlyingSpeed;
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

		Quadcopter other = (Quadcopter) obj;

		return super.getCreationYear() == other.getCreationYear() && super.getCylinders() == other.getCylinders()
				&& super.getPassengerCapacity() == other.getPassengerCapacity()
				&& this.maxFlyingSpeed == other.getMaxFlyingSpeed() && super.getBrand() == other.getBrand();
	}

}