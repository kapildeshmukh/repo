package com.practice.dpattren.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public Float getCost() {
		
		float cost = 0.0f;
		
		for (Item item : items) {
			cost += item.price();
		}
		
		
		return cost;
	}
	
	public void  showItem() {
		for (Item item : items) {
			System.out.print("Item Name : " + item.name());
			System.out.print("Item Packing : " + item.packing().pack());
			System.out.println("Item Price : " + item.price());
		}
	}
}
