package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckMain {
	
	private int maxTrucks = 5;
	private int numTrucks = 0;

	private FoodTruck[] foodTrucksArray = new FoodTruck[maxTrucks];

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckMain app = new FoodTruckMain();

		app.mainMenu();
		app.programLoop();
		app.menu2();

	}

	public void programLoop() {

		boolean keepGoing = true;
		int truckCount = 1;

		while (keepGoing) {

			if (truckCount == 6) {
				System.out.println("You have chosen to enter information for " + --truckCount + " food truck(s). ");
				keepGoing = false;
				break;
			}

			System.out.print("Enter the food truck name for truck " + truckCount + ": ");
			String truckName = kb.nextLine();

			if (truckName.equalsIgnoreCase("Quit")) {
				System.out.println("You have chosen to enter information for " + --truckCount + " food truck(s). ");
				keepGoing = false;
				break;
			}

			System.out.print("Enter the type of food served on  " + truckName + " ");
			String foodType = kb.nextLine();

			System.out.print("Enter the rating for " + truckName + " ");
			double truckRating = kb.nextDouble();
			kb.nextLine();

			System.out.println();

			FoodTruck userFoodTruck = new FoodTruck(truckName, foodType, truckRating);

			addTruck(userFoodTruck);
			truckCount++;

		}
	}

	public void addTruck(FoodTruck foodTruck) {
		if (numTrucks == maxTrucks) {
			System.out.println("You have reached the maximum number of Food Trucks");
		} else {
			for (int i = 0; i < foodTrucksArray.length; i++) {
				if (foodTrucksArray[i] == null) {
					foodTrucksArray[i] = foodTruck;
					numTrucks++;
					break;
				}
			}
		}
	}

	public void displayFoodTrucks(FoodTruck[] foodTrucks) {
		for(int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] != null) {
				System.out.println(foodTrucks[i]);
			}

		}

	}

	public void displayAverage(FoodTruck[] foodTrucks) {

		double sumOfRatings = 0;

		for (FoodTruck foodTruck : foodTrucks) {
			double rating = foodTruck.getRating();
			sumOfRatings = sumOfRatings + rating;
		}
		double averageRating = 0;
		averageRating = sumOfRatings / foodTrucks.length;
		System.out.println("The average rating of all " + numTrucks + " trucks is " + averageRating + ".");
	}

	public void winner(FoodTruck[] foodTrucks) {

		double topRating = 0;
		String name = "";
		String foodType = "";
		int truckId = 0;

		for (FoodTruck foodTruck : foodTrucks) {
			double ratings = foodTruck.getRating();
			if (topRating < ratings) {
				topRating = ratings;
				name = foodTruck.getName();
				foodType = foodTruck.getFoodType();
				truckId = foodTruck.getNextTruckId();
			
			}
		}

		System.out.println("The highest rated truck out of your selections with a rating of " + topRating + " is \n"
				+ name + " that serves up some most excellent " + foodType + ", this truck has an ID number of " + truckId);
	}

	public void menu2() {
		Scanner kb = new Scanner(System.in);

		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println();
			System.out.println();
			System.out.println("::::::::::::::::::::::::::::::::::::");
			System.out.println(":::::What would you like to do?:::::");
			System.out.println("::::::::::::::::::::::::::::::::::::");
			System.out.println("::::::Select a number to view:::::::");
			System.out.println("::::::::::::::::::::::::::::::::::::");
			System.out.println();
			System.out.println(" 1. List all existing trucks");
			System.out.println(" 2. View average rating of all trucks");
			System.out.println(" 3. Display highest rated truck");
			System.out.println(" 4. Quit");
			System.out.println();
			System.out.println();

			String choice = kb.next();

			switch (choice) {
			case "1":
				displayFoodTrucks(foodTrucksArray);
				break;
			case "2":
				displayAverage(foodTrucksArray);
				break;
			case "3":
				winner(foodTrucksArray);
				break;
			case "Quit":
			case "quit":
			case "QUIT":
			case "4":
				theEnd();
				keepGoing = !true;
				break;
			default:
				System.out.println("Invalid option, please enter a valid option");
				break;
			}
		}
		kb.close();

	}

	public void mainMenu() {

		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("::Welcome To Milo's Food Truck App::");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("::Please begin entering truck info::");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("::You may enter up to five trucks:::");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println(" Enter Quit at truck name to move on");
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println();
		System.out.println();
	}

	public void theEnd() {

		System.out.println();
		System.out.println();
		System.out.println("    Thank you for using Milo's Food Truck app.");
		System.out.println("          Have a most excellent day!!!");
		System.out.println("                                                         ");
		System.out.println("              | | | | | | | | | | |                                      ");
		System.out.println("              | | | | | | | | | | |                           ");
		System.out.println("             ---------     ---------                                            ");
		System.out.println("             |       |-----|       |               ");
		System.out.println("             |   0   |     |   0   |               ");
		System.out.println("             |       |     |       |                         ");
		System.out.println("             ---------     ---------                                   ");
		System.out.println("               )                 (           ");
		System.out.println("                )      0 0      (          ");
		System.out.println("                 )             (                                                ");
		System.out.println("                 |             |             ");
		System.out.println("                 |_____________|          ");
		System.out.println("                 |             |                   ");
		System.out.println("            ~~~  )             (  ~~~                   ");
		System.out.println("        ~~~~    )    /    \\     (    ~~~~                    ");
		System.out.println("    ~~~~        \\    \\    /     /       ~~~~                ");
		System.out.println("                 \\~~~ --- ~~~~ /                             ");
		System.out.println("                     |    |                               ");
		System.out.println("                     |    |                               ");
		System.out.println("                     |    |                                ");
		System.out.println("                     |    |                              ");
		System.out.println("                      \\  /                               ");
		System.out.println("                       \\/                                ");
		System.out.println("                                       ");
		System.out.println(" Exiting Milo's Food Truck app... ");

	}
}

//
// foodTruck.getName(truckName);
// foodTruck.getFoodType();
// foodTruck.getRating();

//

// foodTruck.toString();

// private void enterTrucks(Scanner kb) {

// System.out.println(foodTruckArray[0]);

// System.out.println(foodTruckArray[i].toString());

// foodTruck.toString();

// }

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

/*
 * public FoodTruck[] getFoodTrucks() { FoodTruck[] truckCopy = new
 * FoodTruck[MAX_TRUCKS]; truckCopy = new FoodTruck[numTrucks]; for (int i = 0;
 * i < numTrucks; i++) { truckCopy[i] = foodTrucksArray[i];
 * truckCopy.toString(); } return truckCopy;
 * 
 * 
 * }
 */