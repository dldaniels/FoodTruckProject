package com.skilldistillery.foodproject;

public class FoodTruck {
	private static int truckCount;
	
	private double rating;
	private String foodType;
	private String name;
	private int truckId;

	
	public FoodTruck() 
	{
		++truckCount;
		truckId = truckCount;
	}
	

	public FoodTruck(int truckId, double rating, String foodType, String name) {
		this.truckId = FoodTruck.truckCount;
		this.rating = rating;
		this.foodType = foodType;
		this.name = name;

	}

	public int getNumericId() {
		return truckCount;
	}

	public void setNumericId(int numericId) {
		FoodTruck.truckCount = numericId;
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
	
	public int getTruckId(int truckId) {
		return truckId;
	}
	
	public void setTruckId(int truckId) {
		this.truckId = FoodTruck.truckCount;
	}
	
	

	public String toString() {
		String output = "Name: " + name + " , Food type: " + foodType + " , Rating: " + rating + " , Numeric Id : "
				+ truckId + " , truck count " + truckId; 
		return output;
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