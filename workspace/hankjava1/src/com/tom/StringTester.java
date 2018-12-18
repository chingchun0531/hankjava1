package com.tom;

public class StringTester {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(n != 99);
		String s = "Hello world";
		String s2 = new String("Jack Tom Eric");
		// String s2 = new String("Hello world");
		// System.out.println(s == s2);
		System.out.println(s.substring(8));
		System.out.println(s.substring(2, 7));
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s2.lastIndexOf("c"));
		String name = "Tom";
		name = name.replace("Tom", "boss");
		System.out.print(s2.substring(0, 5) + name + s2.substring(8, 13));
		/*
		¥tsol:
		int index = s2.indexOf(name);
		System.out.println(index); 
		System.out.println(s2.substring(0,index) + "boss" + s2.substring(index+name.length()));
		*/
		System.out.println();
		int nn = Integer.parseInt("11");
		nn++;
		System.out.println(nn);
		float f = Float.parseFloat("27.3");
		System.out.println(f);
	}
}
