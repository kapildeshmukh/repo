package com.practice.dpattren.prototype;

public class Prototype {
	
		public static void main(String[] args) throws CloneNotSupportedException  {
			
			ShapeCache.loadCache();
			
			Shape clonedShape = (Shape) ShapeCache.getShape("1");
			System.out.println("Shape --> " + clonedShape.getType());
			
			Shape clonedShape1 = (Shape) ShapeCache.getShape("2");
			System.out.println("Shape --> " + clonedShape1.getType());
		}
}
