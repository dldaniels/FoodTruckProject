package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckMain {
	FoodTruck[] foodTruckArray = new FoodTruck[5];
	FoodTruck foodTruck;

	public static void main(String[] args) {
		FoodTruckMain project = new FoodTruckMain();

		project.mainMenu();
		project.start();

	}

	public void mainMenu() {

		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println(":::::::Welcome To The Food Truck::::");
		System.out.println("::::::::::::::::Tracker:::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("::Please begin entering truck info::");
		System.out.println("::You may enter up to five trucks:::");
		System.out.println(" Enter Quit at truck name to move on");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println();
		System.out.println();
	}

	public void start() {

		Scanner kb = new Scanner(System.in);
		foodTruck = new FoodTruck();
		boolean keepGoing = true;
		int truckCount = 1;

		while (keepGoing) {

			if (truckCount == 6) {
				keepGoing = false;
				break;
			}

			System.out.print("Enter the food truck name for truck " + truckCount + ": ");
			String truckName = kb.nextLine();

			if (truckName.equalsIgnoreCase("Quit")) {
				keepGoing = false;
				break;
			}

			System.out.print("Enter the type of food served on  " + truckName + " ");
			String foodType = kb.nextLine();

			System.out.print("Enter the rating for " + truckName + " ");
			double truckRating = kb.nextDouble();
			kb.nextLine();

			System.out.println();

			foodTruck.setName(truckName);
			foodTruck.setFoodType(foodType);
			foodTruck.setRating(truckRating);
			truckCount++;
			//
			// foodTruck.getName(truckName);
			// foodTruck.getFoodType();
			// foodTruck.getRating();


//
		//	 for (int i = 0; i < foodTruckArray.length; i++) {
		//	 foodTruck = foodTruckArray[i]; foodTruck.toString();

		//	 }

			// foodTruck.toString();

		}

		// private void enterTrucks(Scanner kb) {

		// System.out.println(foodTruckArray[0]);

		// System.out.println(foodTruckArray[i].toString());

		// foodTruck.toString();

		// }

		kb.close();
	}
}

/*
 * User Story #1 The user is prompted to input the name, food type, and rating
 * for up to five food trucks. For each set of input, a FoodTruck object is
 * created, its fields set to the user's input, and it is added to the array.
 * The truck id is not input by the user, but instead assigned automatically in
 * the FoodTruck constructor from a static field that is incremented as each
 * truck is created.
 * 
 * User Story #2 If the user inputs quit for the food truck name, input ends
 * immediately and the program continues.
 * 
 * User Story #3 After input is complete, the user sees a menu from which they
 * can choose to:
 * 
 * List all existing food trucks. See the average rating of food trucks. Display
 * the highest-rated food truck. Quit the program. User Story #4 After choosing
 * a menu item, the user sees the menu again and can choose another item until
 * the choose to quit.
 */
