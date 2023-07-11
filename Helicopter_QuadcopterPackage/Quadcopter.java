package Helicopter_QuadcopterPackage;

public class Quadcopter extends Helicopter { // A Quadcopter, is a Helicopter that additionally has the following: max
												// flying speed (int type), which indicates its maximum moving speed.

	private int maxFlyingSpeed;

	public Quadcopter() {
		super();
	}

	public Quadcopter(String brand, double price, int horsepower, int numCylinders, int yearCreation,
			int passengerCapacity, int maxFlyingSpeed) {
		super(numCylinders, yearCreation, passengerCapacity, brand, price, horsepower);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	public Quadcopter(Quadcopter quad) {
		super.setBrand(quad.getBrand());
		super.setPrice(quad.getPrice());
		super.setHorsePower(quad.getHorsePower());
		super.setCylinders(quad.getCylinders());
		super.setCreationYear(quad.getCreationYear());
		super.setPassengerCapacity(quad.getPassengerCapacity());
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
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;

		Quadcopter other = (Quadcopter) obj;

		return super.getCreationYear() == other.getCreationYear() && super.getCylinders() == other.getCylinders()
				&& super.getPassengerCapacity() == other.getPassengerCapacity()
				&& this.maxFlyingSpeed == other.getMaxFlyingSpeed();
	}

}