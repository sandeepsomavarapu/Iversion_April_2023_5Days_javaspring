package com.iverson.coreexamples;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);// ctrl+shift+O- to organize imports
//		System.out.println("Enter first number for addition");
//		int fnum = scan.nextInt();
//		System.out.println("Enter Second number for addition");
//		int snum = scan.nextInt();
//		System.out.println("Enter Third float for addition");
//		float tnum = scan.nextFloat();
//		float result = fnum + snum + tnum;
//		System.out.println("Enter your name");
//		System.out.println("addition of two numbers : " + result);
//
//		String fullName = scan.next();
//
//		System.out.println(fullName);// "sandeep" ,"123"

		String a = "1.2";
		String b = "2.5";// wrapper classes

		System.out.println(a + b);

		float a1 = Float.parseFloat(a);
		float b1 = Float.parseFloat(b);
		
		System.out.println(a1 + b1);
	}

}
