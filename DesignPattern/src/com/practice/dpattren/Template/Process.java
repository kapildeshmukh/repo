package com.practice.dpattren.Template;

public abstract class Process {

	protected abstract String m3();
	protected abstract String m4();
	public abstract String m5();
	public abstract String m1();
	public abstract String m2();

	
	public void execute() {
		m1();
		m2();
		m3();
		m4();
		m5();
	}
}
