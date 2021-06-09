package com.cyient.methods;

public class RectangelTest {
	
	// declartion of static method
	public static int areaOfRectangel(int length ,int breadth)
	{
		
	   return 	length*breadth;
	 
	}

	public static void main(String[] args) {
		
		//declartion of local variable
		int len = 12;
		int bre = 15;
		
    int res= RectangelTest.areaOfRectangel(len, bre);
     System.out.println(res);
	}

}
