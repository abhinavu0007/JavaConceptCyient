package com.cyient.methods;

public class TriangleArea {
	
	public static double areaOfTriangle(int length, int height)
	{
		
		return length*height*0.5;
	}

	public static void main(String[] args) {
		
		int len =5;
		int hei= 5;
		double res = TriangleArea.areaOfTriangle(len, hei);
		System.out.println(res);
		

	}

}
