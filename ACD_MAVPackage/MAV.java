package ACD_MAVPackage;

import UAVPackage.UAV;

public class MAV extends UAV { // a miniature UAV that has a size restriction (and can be as small as few centimeters. It has the following: model (String type) and size (double type).  
	
	private String model;
	private double size;
	
	public MAV() {//default constructor
		this.model = "MicroFlyer";
		this.size = 7.55;	
	}
	
	public MAV(MAV copy) {//copy constructor
		super(copy);
		this.model = copy.model;
		this.size = copy.size;
	}
	public MAV(double w, double p, String m, double s) {//parameter constructor
		super(w, p);
		this.model = m;
		this.size = s;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return ("This Micro Air Vehicle is a model " + model + ". It weighs " + super.getWeight()
				+ " pounds, and costs " + super.getPrice() + "$. It's size is " + size + "cubic centimeters.");
	}
	@Override
	public boolean equals(MAV check) {
		if (this.model == check.model && this.size == check.size && getWeight() == check.getWeight() && getPrice() == check.getPrice()) {
			return true;
		}
		return false;
	}
}
