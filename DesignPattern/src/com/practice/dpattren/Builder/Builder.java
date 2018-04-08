package com.practice.dpattren.Builder;

public class Builder {
	
	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Show Veg Meal ::");	
		
		vegMeal.showItem();
		
		System.out.println("Cost --> "+ vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Show Non Veg Meal ::");	
		
		nonVegMeal.showItem();
		
		System.out.println("Cost --> "+ nonVegMeal.getCost());
	}
	
	
}
