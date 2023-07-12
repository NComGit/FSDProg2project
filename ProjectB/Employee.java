package ProjectB;
public class Employee {
	
	String name;
	int id; 
	Date hiredDate;
	String position;
		
	//by parameter constructor
	public Employee(String name, int id, Date hiredDate, String position) {
		
		this.name = name;
		this.id = id;
		this.hiredDate = hiredDate;
		this.position = position; 
		
	}
	
	//by copy constructor
	public Employee(Employee e) {
		this.name = e.name;
		this.id = e.id;
		this.hiredDate = e.hiredDate;
		this.position = e.position; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		//return "Employee name: " + name + ", ID: " + id + ", Hired Date: " + hiredDate + ", Position: " + position;
		return name + " ID# " + id + " \t " + hiredDate + " " + position;
	}
	
	
	
	
}
