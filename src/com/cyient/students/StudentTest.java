package com.cyient.students;

public class StudentTest {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.id=1001;
		obj.name="Jack";
		obj.mail="jack@gmail.com";
		obj.password="qwert@#12";
		Student.schoolName="Global School";
		
		Student.printStudentDetails(obj);
		
		Student obj1 = new Student();
		obj1.id=1002;
		obj1.name="Abhinav";
		obj1.mail="abhinavu007@gmail.com";
		obj1.password="qwert@#98";
		Student.schoolName="Global School";
		 
		Student.printStudentDetails(obj1);
		
		Student obj2 = new Student();
		obj2.id=1003;
		obj2.name="Abhishek";
		obj2.mail="abhisheku007@gmail.com";
		obj2.password="qwert@#23498";
		Student.schoolName="Global School";
		 
		Student.printStudentDetails(obj2);
		
		obj.printStudentRecord();
		obj1.printStudentRecord();
		

	}

}
