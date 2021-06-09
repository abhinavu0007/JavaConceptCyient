package com.cyient.students;

public class Student {

    public int id;
	public String name;
	public String mail;
	public String password;
	public static String schoolName;
	
	public static void printStudentDetails(Student obj)
	{
		System.out.println("Student id " +obj.id );
		System.out.println("Student name " +obj.name);
		System.out.println("Student mail " + obj.mail);
		System.out.println("Password " + obj.password);
		System.out.println("School Name " + schoolName);
		System.out.println(obj);
	}
	public static void printStudentDetails1(Student obj1)
	{
		System.out.println("Student id " +obj1.id );
		System.out.println("Student name " +obj1.name);
		System.out.println("Student mail " + obj1.mail);
		System.out.println("Password " + obj1.password);
		System.out.println("School Name " + schoolName);
	}
	
   
	public static void printStudentDetails2(Student obj2)
	{
		
		System.out.println("Student id " +obj2.id );
		System.out.println("Student name " +obj2.name);
		System.out.println("Student mail " + obj2.mail);
		System.out.println("Password " + obj2.password);
		System.out.println("School Name " + schoolName);
		System.out.println(obj2);
		
	}
	public void printStudentRecord()
	
	
	{
	System.out.println(id);	
	System.out.println(name);
	System.out.println(mail);
		
	}
	
	public static Student createStudentObject()
	{
		Student s = new Student();
		return s;
	}
	
	
}
