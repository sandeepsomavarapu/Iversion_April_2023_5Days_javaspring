package com.iverson.oops;

 class Parent2 {//final  before variable,method,class

	 byte age = 30;

	public  void printAge() {
		age = ++age;
		System.out.println("Age is : " + age);
	}

}

public class MethodOverridingEx extends Parent2 {
	
	public void printAge() {
		age = --age;
		System.out.println("Age is : " + age);
	}

	public static void main(String[] args) {
		MethodOverridingEx obj = new MethodOverridingEx();
		obj.printAge();
	}

}
