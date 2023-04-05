package com.iverson.oops;

public class MethodOverLoadingEx {

	public void add(float a, float b) {

		System.out.println("add of two float's : " + (a + b));
	}

	public void add(int a, int b) {

		System.out.println("add of two int's : " + (a + b));
	}

	public void add(int a, int b, int c) {

		System.out.println("add of three int's : " + (a + b + c));
	}

	public void add(int a, float b) {

		System.out.println("add of int,float : " + (a + b));
	}

	public void add(float a, int b) {

		System.out.println("add of two float ,int : " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverLoadingEx obj=new MethodOverLoadingEx();
		obj.add(12.3f, 23.4f);
		obj.add(12, 23);
		obj.add(12, 23,22);
		obj.add(12.5f,9);
	}

}
