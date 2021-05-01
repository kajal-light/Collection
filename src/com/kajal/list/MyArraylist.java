package com.kajal.list;

import java.util.ArrayList;
import java.util.Collections;

public class MyArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ht = new ArrayList<String>();
		// adding color in to a given array
		ht.add("Red");
		ht.add("yellow");
		ht.add("black");
		ht.add("purple");
		ht.add("white");
//printing out the array list
		System.out.println(ht);
//iterate
		System.out.println("*************Advance for loop***********");
		for (String elements : ht) {
			System.out.println(elements);

		}

		// performing insertion operation

		ht.add(0, "pink");
		System.out.println(ht);

		// retrieve the data
		System.out.println("*************Normal for loop***********");
		for (int i = 0; i < ht.size(); i++) {

			System.out.println(ht.get(i));
		}
		// Write a java program to updates specific array element by given element

		ht.set(2, "kajal");
		System.out.println(ht);

		// remove operation

		ht.remove(4);
		System.out.println(ht);

		// search elements

		if (ht.contains("Red")) {
			System.out.println("FOUND");

		} else {

			System.out.println("NOT");
		}

		// sort

		Collections.sort(ht);
		System.out.println(ht);

		// copy
		ArrayList<String> ht1 = new ArrayList<String>();

		ht1.add("a");

		ht1.add("b");

		ht1.add("c");
		ht1.add("d");
		System.out.println(ht1);

//copy ht1 into ht
		Collections.copy(ht, ht1);

		System.out.println(ht);
		System.out.println(ht1);

		// shuffle

		Collections.shuffle(ht);

		System.out.println(ht);
		// reverse

		Collections.reverse(ht);
		System.out.println(ht);
		// extract

		System.out.println(ht.subList(0, 3));

		// compare
		// storing the comparison output in array string

		ArrayList<String> a = new ArrayList<String>();
		// iterate
		for (String e : ht)
			a.add(ht1.contains(e) ? "yes" : "no");
		System.out.println(a);

		// swap

		Collections.swap(ht, 0, 2);
		// for(String d:ht) {
		System.out.println(ht);

		// }
		// adding two array

		ArrayList<String> b = new ArrayList<String>();

		b.addAll(ht1);

		b.addAll(ht);
		System.out.println(b);

		// clone
		ht1.clone();
		System.out.println(ht1.clone());

//trimto size

		ht1.trimToSize();

		System.out.println(ht1);

		// remove all

		ht.removeAll(ht);
		System.out.println(ht);

		// checking empty or not
		ht.isEmpty();

		System.out.println(ht.isEmpty());

	}

}
