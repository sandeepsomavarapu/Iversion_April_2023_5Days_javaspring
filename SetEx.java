package com.iverson.collections;

import java.util.HashSet;

//Collections:
//===========
//	1)collections are not fixed in size /growable in nature .
//	2)collections can store both homogeneous/heterogeneous data .
//	3)lots of utility methods
//		SET:
//		======
//	4)Duplicates are not allowed 
//	5)Insertion order not preserved 
public class SetEx {

	public static void main(String[] args) {
		HashSet<String> al = new HashSet<String>();// 10 ,11th value-->16 (cc*3/2)+1 hashmap-->key,value
		al.add("rajesh");
		al.add("mahesh");// 'b'
		al.add("naresh");
		al.add("mukesh");
		al.add("mahesh");
		al.add("somesh");

		System.out.println(al);

		HashSet<Integer> al1 = new HashSet<Integer>();
		int a = 12;
		al1.add(123);//AUTOBOXING -->PREMITIVE--->WRAPPER 
		al1.add(a);
	}

}
