package com.iverson.collections;

import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		TreeMap <Integer,String>emps=new TreeMap<Integer,String>();//16
		
		emps.put(111,"mahesh");
		emps.put(421,"naresh");
		emps.put(1203,"rajesh");
		emps.put(111,"sandeep");
		emps.put(659,"somesh");
		System.out.println(emps);
		//System.out.println(emps.hashCode());
		
	}

}
