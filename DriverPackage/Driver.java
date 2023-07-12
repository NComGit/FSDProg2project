package DriverPackage;

import AirplanePackage.Airplane;
import ACD_MAVPackage.ACD;
import ACD_MAVPackage.MAV;
import Helicopter_QuadcopterPackage.Helicopter;
import Helicopter_QuadcopterPackage.Quadcopter;
import MultirotorPackage.Multirotor;
import UAVPackage.UAV;

public class Driver {

	public static void main(String[] args) {
		// Declaring an array of objects, with a length of 16.
		// Declaring an array of objects of Airplane, with a length of 15
		Object[] array1 = new Object[16];
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

		array1[9] = new UAV(900, 10500);
		array1[10] = new UAV(850, 6000);
		array1[11] = new UAV(720, 12000);
		array1[12] = new UAV(600, 3000);

		array1[13] = new ACD();
		array1[14] = new ACD();

		array1[15] = new MAV();

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
		System.out.println();

		// Creating objects and placing them into array2
		for (int i = 0; i < array2.length; i++) {
			array2[i] = new Airplane("ConAir", 120000, 30000);
		}

		// Testing findLeastAndMostExpensiveUAV() method with array1 (with UAV)
		System.out.println("Finding most/least expensive UAV in array1:");
		findLeastAndMostExpensiveUAV(array1);

		System.out.println();

		// Testing findLeastAndMostExpensiveUAV() method with array2 (without UAV)
		System.out.println("Finding most/least expensive UAV in array2:");
		findLeastAndMostExpensiveUAV(array2);

	}

	public static void findLeastAndMostExpensiveUAV(Object[] array) {

		int count = 0;

		// Checking if any of the objects in the given array are of class UAV,
		// If so, the count is increased
		for (int i = 0; i < array.length; i++) {
			if (UAV.class == array[i].getClass()) {
				count++;
			}
		}

		if (count != 0) {
			// Creating array of UAV objects to store UAV object from Object[] array
			UAV[] UAVs = new UAV[count];

			// Checking which objects in the given array are of class UAV,
			// If array[i] is UAV object then it is added to array UAVs
			for (int i = 0, j = 0; i < array.length; i++) {
				if (UAV.class == array[i].getClass()) {
					UAVs[j] = (UAV) array[i];
					j++;
				}
			}

			UAV uavMax = new UAV(UAVs[0]);
			UAV uavMin = new UAV(UAVs[0]);

			for (int i = 0; i < (UAVs.length); i++) {

				// Comparing UAV[i] with with uavMax; uavMax is equal to whichever is higher
				if (UAVs[i].getPrice() >= uavMax.getPrice()) {
					uavMax = UAVs[i];
				}

				// Comparing UAV[i] with with uavMin; uavMin is equal to whichever is lower
				if (UAVs[i].getPrice() <= uavMin.getPrice()) {
					uavMin = UAVs[i];
				}

			}
			// Printing toString of most and least expensive UAV
			System.out.println("The most expensive UAV is:" + uavMax.toString());
			System.out.println("The least expensive UAV is: " + uavMin.toString());

		} else {
			System.out.println("No UAVs present in given array.");
			return;
		}
	}
}
