package ProjectB;

public class Date {
	
	int month;
	int day;
	int year;
	
	public Date(int m, int d, int y) {
		
		if(dateOK(m, d, y)) {
			this.month = m;
			this.day = d;
			this.year = y;
		}
		else {
			this.month = 1;
			this.day = 1;
			this.year = 1900;
		}		
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	
	@Override
	public String toString() {
		return month + " / " + day + " / " + year;
	}

	private boolean dateOK(int month, int day, int year) {
		if( day >= 1 && day <= 31 && month >= 1 &&  month <= 12 && year >= 1000 && year <= 9999) {
			return true;
		}
		else {
			return false;
		} 		
	}
	
	

}
