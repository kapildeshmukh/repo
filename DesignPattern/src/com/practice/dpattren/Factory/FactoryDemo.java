package com.practice.dpattren.Factory;

public class FactoryDemo {

	public static void main(String[] args) {

		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal animalDog = animalFactory.getAnimal("dog");
		System.out.println(animalDog.makeSound());
		
		Animal animalCat = animalFactory.getAnimal("cat");
		System.out.println(animalCat.makeSound());
	}
	
	//Abstract Factory Pattern is same as factory pattern just that it is a factories of factory

}
