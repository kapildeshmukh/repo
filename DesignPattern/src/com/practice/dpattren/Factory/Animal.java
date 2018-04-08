package com.practice.dpattren.Factory;

public abstract class Animal {
	public abstract String makeSound();
}

class Dog extends Animal{

	@Override
	public String makeSound() {
		return "Woof";
	}
}

class Cat extends Animal{

	@Override
	public String makeSound() {
		return "Meew";
	}
}

class AnimalFactory{
	public Animal getAnimal(String str) {
		if(str.toLowerCase().equals("dog")){
			return new Dog();
		  }
		else if (str.toLowerCase().equals("cat")){
			return new Cat();
		}
		return null;
	}
}
