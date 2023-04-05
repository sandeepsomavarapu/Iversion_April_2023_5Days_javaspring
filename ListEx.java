package com.iverson.collections;

import java.util.ArrayList;

//Collections:
//===========
//	1)collections are not fixed in size /growable in nature .
//	2)collections can store both homogeneous/heterogeneous data .
//	3)lots of utility methods
//		List:
//		======
//	4)Duplicates are allowed 
//	5)Insertion order preserved 
public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// 10 ,11th value-->16 (cc*3/2)+1
		al.add("rajesh");
		al.add("mahesh");//'b'
		al.add("naresh");
		al.add("mukesh");
		al.add("mahesh");
		al.add("somesh");
	
		System.out.println(al);
	}

}
