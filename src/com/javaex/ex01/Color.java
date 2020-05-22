package com.javaex.ex01;

public class Color extends Shape{

	public Color(String fillcolor) {
		super(fillcolor);
	}
	
	public void draw() {
		System.out.println("[색상]#색상:" +super.fillColor);
	}
	
}
