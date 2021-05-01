package com.kajal.hashtable;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class CopyHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashMap<Integer,String> hmap=new HashMap<>();
		
		hmap.put(1, "kajal");
		hmap.put(2, "rani");
		hmap.put(3, "kadu");
		
		//creating an object for hastable
		Hashtable<Integer,String> ht=new Hashtable<>();
		
		ht.put(4,"hamk");
		System.out.println("BEFORE");
		Enumeration e=ht.elements();
		
		
		while(e.hasMoreElements())
			
			System.out.println(e.nextElement());
		
		ht.putAll(hmap);
		
		
		System.out.println("aFTER");
		
		e=ht.elements();
		

		while(e.hasMoreElements())
			
			System.out.println(e.nextElement());
		
	}

}
