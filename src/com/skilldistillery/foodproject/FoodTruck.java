package com.skilldistillery.foodproject;

public class FoodTruck {
	private static int truckId = 5089;
	private int nextTruckId;

	private String foodType;
	private String name;
	private double rating;

	public FoodTruck() {

	}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;

	}

	public FoodTruck(String name, String foodType, double rating, int truckId) {
		this(name, foodType, rating);
		FoodTruck.truckId = truckId;
		this.nextTruckId = FoodTruck.truckId;
	}

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

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getTruckId() {
		return truckId;
	}

	public static void setTruckId(int truckId) {
		FoodTruck.truckId = truckId;
	}

	public int getNextTruckId() {
		return nextTruckId;
	}

	public void setNextTruckId(int nextTruckId) {
		this.nextTruckId = FoodTruck.truckId++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [nextTruckId=").append(nextTruckId).append(", foodType=").append(foodType)
				.append(", name=").append(name).append(", rating=").append(rating).append("]");
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