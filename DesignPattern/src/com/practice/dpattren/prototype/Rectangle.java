package com.practice.dpattren.prototype;

public class Rectangle extends Shape {

	 public Rectangle() {
		 type = "Rectangle"; 
	 }
	
	@Override
	void draw() {

		System.out.println("Rectangle Drawn !!!!");
	}

}
