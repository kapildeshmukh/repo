package com.practice.dpattren.Template;

public class TemplatePatternDemo extends Process {

	@Override
	protected String m3() {
		System.out.println("method 3");
		return "method 3";
	}

	@Override
	protected String m4() {
		System.out.println("method 4");
		return "method 4";
	}

	@Override
	public String m5() {
		System.out.println("method 5");
		return "method 5";
	}

	@Override
	public String m1() {
		System.out.println("method 1");
		return "method 1";
	}

	@Override
	public String m2() {
		System.out.println("method 2");
		return "method 2";
	}
	
	public static void main(String[] args) {
		TemplatePatternDemo demo = new TemplatePatternDemo();
		demo.execute();
	}
	


}
