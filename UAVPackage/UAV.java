package UAVPackage;

public class UAV { // (Unmanned aerial vehicle / Drone) class has the following attributes: weight (double type), and price (double type).  
	
	private double weight;
	private double price;
	
	public UAV() {//default constructor
		this.weight = 70.45;
		this.price = 367.95;	
	}
	
	public UAV(UAV copy) {//copy constructor
		this.weight = copy.weight;
		this.price = copy.price;
	}
	public UAV(double w, double p) {//parameter constructor
		this.weight = w;
		this.price = p;
	}
	
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return ("UAV Weight:  " + weight
		+ " lbs | Price:  " + price + "$");
}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj.getClass() != getClass()) {
			return false;
		}
		
		UAV check = (UAV) obj;
		
		if (this.weight == check.weight && this.price == check.price) {
			return true;
		}
		return false;
	}
	
}
