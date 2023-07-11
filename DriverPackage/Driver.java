package DriverPackage;

import AirplanePackage.Airplane;
import AgriculturalDrone_MAVPackage.AgriculturalDrone;
import AgriculturalDrone_MAVPackage.MAV;
import Helicopter_QuadcopterPackage.Helicopter;
import Helicopter_QuadcopterPackage.Quadcopter;
import MultirotorPackage.Multirotor;
import UAVPackage.UAV;

public class Driver {

	public static void main(String[] args) {
		// Declaring an array of objects, with a length of 15.
		// Declaring an array of objects of Airplane, with a length of 15
		Object[] array1 = new Object[15];
		Airplane[] array2 = new Airplane[15];

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

		array1[11] = new AgriculturalDrone();
		array1[12] = new AgriculturalDrone();

		array1[13] = new MAV();
		array1[14] = new MAV();

		// Displaying the info of each object of array1
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Flying object #" + i + ". ");
			System.out.println(array1[i].toString());
		}

		// Testing isEqual method
		System.out.println();
		System.out.println("Is flying object #4 identical to #6: " + array1[4].equals(array1[6]));
		System.out.println("Is flying object #4 identical to #5: " + array1[4].equals(array1[5]));
		System.out.println("Is flying object #4 identical to #1: " + array1[4].equals(array1[1]));

		// Creating objects and placing them into array2
		for (int i = 0; i < array2.length; i++) {
			array2[i] = new Airplane("ConAir", 120000, 30000);
		}

	}

	public static void findLeastAndMostExpensiveUAV(Object[] array) {

	}

}
