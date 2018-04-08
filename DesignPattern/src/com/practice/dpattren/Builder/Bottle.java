package com.practice.dpattren.Builder;

public class Bottle implements Packing {

	@Override
	public String pack() {
		System.out.println("Test 1");
		return "Bottle";
	}

}