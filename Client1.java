package com.iverson.oops;

interface A {
	void m1();
}

interface B {
	void m1();
}

public class Client1 implements A, B {

	public static void main(String[] args) {
		Client1 obj=new Client1();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("implemented");
	}

}
