package com.kajal.hashtable;

import java.util.Hashtable;

public class KeyVaule {

	public static void main(String[] args) {
		//creating an object of hastable
		
		Hashtable<String,Integer> ht=new Hashtable<>();
		ht.put("one", 1);
		
		ht.put("two", 2);
		
//ht.get("one");

System.out.println(ht.get("one"));

	}

}
