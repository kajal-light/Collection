package com.kajal.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Myhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> ht1 = new HashMap<>();

		ht1.put(1, "green");

		ht1.put(2, "red");
		ht1.put(3, "ready");

		ht1.put(4, "hash");

		ht1.put(5, "green");

		System.out.println(ht1);

		// iterator

		for (Map.Entry<Integer, String> w : ht1.entrySet()) {

			System.out.println(w.getValue());

			System.out.println(w.getKey());

		}

		// size

		System.out.println(ht1.size());

//copy all of the elements into new amp

		HashMap<Integer, String> ht2 = new HashMap<>();

		ht2.put(6, "kajal");

		ht2.put(7, "renu");
		ht2.put(8, "kaju");

		System.out.println(ht2);

		ht1.putAll(ht2);

		System.out.println(ht1);
		
		
		
		
		

	}

}
