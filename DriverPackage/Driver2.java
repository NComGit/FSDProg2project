package DriverPackage;

import ACD_MAVPackage.ACD;
import ACD_MAVPackage.MAV;
import AirplanePackage.Airplane;
import Helicopter_QuadcopterPackage.Helicopter;
import Helicopter_QuadcopterPackage.Quadcopter;
import MultirotorPackage.Multirotor;
import UAVPackage.UAV;

public class Driver2 {
	
	private static Object[] copyFlyingObjects(Object[] array) {
		
		Object[] copy = new Object[array.length];
		
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		
		return copy;
	}
	
	public static void main(String[] args) {
		// Declaring an array of objects, with a length of 15.
		// Declaring an array of objects of Airplane, with a length of 15
		Object[] array1 = new Object[15];

		// Creating objects and inserting them into array1
		array1[0] = new Airplane("Boeing", 90000000, 60000);
		array1[1] = new Airplane((Airplane) array1[0]);

		array1[2] = new Helicopter();
		array1[3] = new Helicopter();

		array1[4] = new Quadcopter("Lockheed", 350000, 0, 0, 2016, 0, 175);
		array1[5] = new Quadcopter("DJI", 2500, 0, 0, 2020, 0, 95);
		array1[6] = new Quadcopter((Quadcopter) array1[4]);

		array1[7] = new Multirotor();
		array1[8] = new Multirotor();

		array1[9] = new UAV();
		array1[10] = new UAV();

		array1[11] = new ACD();
		array1[12] = new ACD();

		array1[13] = new MAV();
		array1[14] = new MAV();

		// Displaying the info of each object of array1
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Flying object #" + i + ". ");
			System.out.println(array1[i].toString());
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		Object[] copy;
		
		copy = copyFlyingObjects(array1);
		
		for (Object i : copy) {
			System.out.println(i.toString());
			System.out.println();
		}
	}
}