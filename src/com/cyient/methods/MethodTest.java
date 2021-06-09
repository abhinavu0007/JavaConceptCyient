package com.cyient.methods;

public class MethodTest {
	

	public static void main(String[] args) {
     

   Area obj = new Area();
  double area= obj.areaOfCircle(12);
   System.out.println(area);
   int area1= Area.areaOfRectangel(10, 20);
    System.out.println(area1);
    
    
  
  String name = Area.sendMyName();
  System.out.println(name);

  obj.myRole();
  String object = obj.myRole();
  System.out.println(object);
  System.out.println(obj.myRole());
  
  obj.closeBrowser();
  
 
  
   
	}

}
