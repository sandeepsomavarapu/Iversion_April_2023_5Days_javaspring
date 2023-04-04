package com.iverson.oops;

//in java file only one public class allowed and that should be file & that should contain main method
class SuperParent {
	float salary = 45.78f;
	public void m3() {
		System.out.println("am from superparent class m3 mehtod");
	}
}
class Parent extends SuperParent {
	int data = 23;
	public void m2() {
		System.out.println("am from parent class m2 mehtod");
	}
}
public class InheritanceEx extends SuperParent {
	int age = 90;
	public void m1() {
		System.out.println("am from current class m1 mehtod");
	}
	public static void main(String[] args) {
		InheritanceEx obj = new InheritanceEx();
		obj.m1();
		//obj.m2();
		obj.m3();
		System.out.println(obj.salary);
		//System.out.println(obj.data);
		System.out.println(obj.age);
	}
}
