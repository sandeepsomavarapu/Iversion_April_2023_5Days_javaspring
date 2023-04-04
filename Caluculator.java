package com.iverson.oops;

interface Cal { // 100 %
	// interface methods are by default public abstract only....
	void m1();// public abstract void m1();

	public abstract void m2();//
}

abstract class Calci implements Cal {// 0-100%
	public void sub(int a, int b) {
		System.out.println("sub of two number's : " + (a - b));
	}

	public abstract void mul(int a, int b);
}

public class Caluculator extends Calci {
	public void add(int a, int b) {
		System.out.println("add of two number's : " + (a + b));
	}

	public static void main(String[] args) {
		Caluculator cal = new Caluculator();
		cal.add(123, 12);
		cal.sub(12, 3);
		cal.mul(12, 2);
		cal.m1();
		cal.m2();
	}
	@Override
	public void mul(int a, int b) {
		System.out.println("mul of two numbers: " + (a * b));
	}
	@Override
	public void m1() {
		System.out.println("am from m1 method");
	}
	@Override
	public void m2() {
		System.out.println("am from m2 method");

	}
}
