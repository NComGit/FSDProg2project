package ACD_MAVPackage;

import UAVPackage.UAV;

public class ACD extends UAV { // (which is used for crop production) is UAV that additionally has the
								// following: brand (Sting type), and carry capacity (int type).

	private String brand;
	private int carryCap;

	public ACD() {// default constructor
		this.brand = "AgriDrones";
		this.carryCap = 25;
	}

	public ACD(ACD copy) {// copy constructor
		super(copy);
		this.brand = copy.brand;
		this.carryCap = copy.carryCap;
	}

	public ACD(double w, double p, String b, int cc) {// parameter constructor
		super(w, p);
		this.brand = b;
		this.carryCap = cc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCarryCapacity() {
		return carryCap;
	}

	public void setCarryCapacity(int carryCapacity) {
		this.carryCap = carryCapacity;
	}

	@Override
	public String toString() {
		return ("This Agricultural Drone is manufactured by " + brand + ". It weighs " + super.getWeight()
				+ " pounds, and costs " + super.getPrice() + "$. It can carry up to " + carryCap + "KG.");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj.getClass() != getClass()) {
			return false;
		}
		
		ACD check = (ACD) obj;
		
		if (this.brand == check.brand && this.carryCap == check.carryCap && getWeight() == check.getWeight() && getPrice() == check.getPrice()) {
			return true;
		}
		return false;
	}

}
