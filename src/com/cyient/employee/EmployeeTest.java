package com.cyient.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.empNo=101;
		obj.empName="Abhinav";
		obj.empSalary=26805.05;
		Employee.companyName="Cyient";
		
		Employee obj2 = new Employee();
		obj2.empNo=1002;
		obj2.empName="Abhishek";
		obj2.empSalary=60000;
		
		Employee.printEmployeeDetails(obj);
		
		obj.printEmployeeRecord();
		obj2.printEmployeeRecord();
		
	
		

	}

}
