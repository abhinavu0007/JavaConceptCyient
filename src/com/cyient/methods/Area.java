package com.cyient.methods;

public class Area {
	



		

		public static int areaOfRectangel(int length ,int breadth)
		{
			
		   return 	length*breadth;
		 
		}
		public static double areaOfTriangle(int length, int height)
		{
			
			return length*height*0.5;
		}
		
	public  double areaOfCircle(int r)
	    
		{
			double area = 3.14*r*r;
			return area;
			
		}
		
	public static double areaOfSquare(double side)
	{
	return side*side;
	}
	
	public static double areaOfTrapezium(double base , double length , double height)
	{
		return (base+length)*.5*height;
	}
	
	  public static String sendMyName()
	    {
	    	
	    	return "Abhinav";
	    }
	  public String myRole()
	  {
		  String role = "software Engineer";
		  return role;
	  }
	  
	  public void closeBrowser()
	  {
		  
		  
	  }
	

}