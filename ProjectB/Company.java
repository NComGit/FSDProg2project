package ProjectB;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileInputStream;

public class Company {
	
	public static int month;
	public static int day;
	public static int year;	
	public static String name;
	public static int id; 
	public static Date hiredDate;
	public static String position;
	public static Employee[] arrayEmployees = new Employee[30] ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner kb = new Scanner(System.in);	
	
	Employee employee1 = new Employee("Richard", 1001, new Date(01, 01, 2023), "Developer");	
	writeToFile(employee1);
	Employee employee2 = new Employee("Jennifer", 1002, new Date(02, 01, 2023), "Student");
	writeToFile(employee2);
	Employee employee3 = new Employee("John", 1003, new Date(03, 01, 2023), "Clerk");
	writeToFile(employee3);
	Employee employee4 = new Employee("Rachel", 1004, new Date(03, 14, 2023), "Clerk");	
	writeToFile(employee4);
	Employee employee5 = new Employee("Joe", 1005, new Date(04, 01, 2023), "Student");
	writeToFile(employee5);
	
	readFromFile("EmployeeInfoDoc.txt");
	
	System.out.println();	
	System.out.println("===============");
	System.out.println("Employees hired after March 13th, 2023: ");	
	employeesHiredAfterDate(3,13,2023);
	
	}
	
	//Write a method that returns all employees hired after a particular Date. 
	public static void employeesHiredAfterDate(int m, int d, int y) {
		Employee[] filteredEmployees = new Employee[30];
		int counter = 0;
		boolean isAfterParticularDate = false;
		
		for (Employee e : arrayEmployees) {
			if (e == null) {
				System.exit(0);
			}
			if (e.hiredDate.getYear() >= y) {
				if (e.hiredDate.getMonth() == m) {
					if (e.hiredDate.getDay() > d) {
						isAfterParticularDate = true;
					}
				}else if (e.hiredDate.getMonth() > m) {
					isAfterParticularDate = true;
				}
			}
			
			if (isAfterParticularDate) {
				filteredEmployees[counter] = e;
				counter++;
				System.out.println(e);
			}
		}
		
	}	
	
	//method writeToFile
	public static void writeToFile(Employee employee) {
		try {
			FileOutputStream fos = new FileOutputStream("EmployeeInfoDoc.txt", true);
			PrintWriter pw = new PrintWriter(fos);
			pw.print("\n" + employee);
			pw.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public static void readFromFile(String fileName) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileInputStream(fileName));			
		}catch(FileNotFoundException e) {
			System.out.println("File was not found");
			System.out.println("Program Terminated");
			System.exit(0);
		}
		
		int counter = 0;
		
		System.out.println("Information read from file:");
		while(sc.hasNextLine()) {
			name = sc.next();
			sc.next();
			id = sc.nextInt();
			month = sc.nextInt();
			sc.next();
			day = sc.nextInt();
			sc.next();
			year = sc.nextInt();
			position = sc.next();
						
			Employee e = new Employee(name, id, new Date(month, day, year), position);
			
			arrayEmployees[counter] = e;
			counter++;
			System.out.println(e);
		}
		
	} 	
}
