package com.skilldistillery.foodproject;

public class FoodTruckTester {

	public static void main(String[] args) {

		FoodTruck truck1 = new FoodTruck(null, null, 0);
		truck1.setFoodType("Tacos");
		truck1.setName("Taco Revolution");
		truck1.setRating(3.6);

		// truck1.setTruckId(0);

		FoodTruck truck2 = new FoodTruck(null, null, 0);
		truck2.setFoodType("Chicken Wings");
		truck2.setName("Wing Mobile");
		truck2.setRating(4.3);

		FoodTruck truck3 = new FoodTruck(null, null, 0);
		truck3.setFoodType("Pizza");
		truck3.setName("Shakeys Pizza");
		truck3.setRating(2.9);

		FoodTruck truck4 = new FoodTruck(null, null, 0);
		truck4.setFoodType("Waffles");
		truck4.setName("Waffles");
		truck4.setRating(5.0);

		FoodTruck truck5 = new FoodTruck(null, null, 0);
		truck5.setFoodType("Chocolate Salty Balls");
		truck5.setName("Chefs chocolate salty balls");
		truck5.setRating(5.0);

		// truck1.displayFoodTruck();
		// truck2.displayFoodTruck();
		// truck3.displayFoodTruck();
		// truck4.displayFoodTruck();
		// truck5.displayFoodTruck();
		String truck1data = truck1.toString();
		String truck2data = truck2.toString();
		String truck3data = truck3.toString();
		String truck4data = truck4.toString();
		String truck5data = truck5.toString();

		System.out.println("Truck 1 data " + truck1data);
		System.out.println("Truck 2 data " + truck2data);
		System.out.println("Truck 3 data " + truck3data);
		System.out.println("Truck 4 data " + truck4data);
		System.out.println("Truck 5 data " + truck5data);

	}

}
