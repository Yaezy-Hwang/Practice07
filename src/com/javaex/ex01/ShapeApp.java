package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape s = new Color("빨강");
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		r1.draw();
		
		//sr1의 가로크기 출력
		int sr1Width = ((Ractangle)sr1).getWidth();
		System.out.println("sr1의 가로는" +sr1Width+"입니다.");
		
	}
}

	
	