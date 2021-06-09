package com.cyient.string;

public class StringTest {

	public static void main(String[] args) {
	String name1 = "radha";
	String name2 = "radha";
	String name3 = new String("radha");
	System.out.println(name2);
	System.out.println(name1);
	System.out.println(name1 == name2);
	System.out.println(name1==name3);
	System.out.println(name1.equals(name3));

	}

}
