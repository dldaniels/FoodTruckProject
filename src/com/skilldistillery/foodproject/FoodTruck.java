package com.skilldistillery.foodproject;

public class FoodTruck {
	private static int truckId = 5089;
	private int nextTruckId;

	private String foodType;
	private String name;
	private double rating;

	public FoodTruck() {

	}

//	public FoodTruck(int nextTruckId) {

//		truckId = nextTruckId;
//		truckId++;

//	}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.nextTruckId = truckId;
		truckId++;

	}

//	public FoodTruck(String name, String foodType, double rating, int truckId) {
//		this(name, foodType, rating);
		// FoodTruck.truckId = truckId;

//	}

	public double getRating() {
		
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		FoodTruck.truckId = truckId++;
	}

	public int getNextTruckId() {
		return nextTruckId;
	}

	public void setNextTruckId(int nextTruckId) {
		this.nextTruckId = FoodTruck.truckId;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Name = ").append(name).append(", Food Type = ").append(foodType).append(", Rating = ")
				.append(rating).append(", Truck ID = ").append(nextTruckId);
		return builder.toString();
	}

	public void displayFoodTruck() {
		String foodTruckData = this.toString();
		System.out.println(foodTruckData);

	}

}

//You will define a FoodTruck class with fields for a unique numeric id, a name ("TacoRific", "Mediterranean Medic", etc.), 
//food type ("Tacos", "Falafel", etc.), and a numeric rating.
//
//You will create a separate class with a main method that starts the program. It will have an array to store up to five FoodTruck 
//objects. The main method of this class is the only static method in the entire project.
//objects. The main method of this class is the only static method in the entire project.