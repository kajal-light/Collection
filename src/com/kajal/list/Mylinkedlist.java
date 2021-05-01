package com.kajal.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Mylinkedlist {

	public static void main(String[] args) {

		// add elements in to linked list

		LinkedList<String> ht = new LinkedList<>();

		ht.add("apple");
		ht.add("red");
		ht.add("kajal");
		ht.add("mango");
		ht.add("brown");
		// print

		System.out.println(ht);

		// iterator

		for (String e : ht) {

			System.out.println(e);
		}

		// iterate statring at 1st position

		Iterator itr = ht.listIterator(1);
		// om 2 nd position//printing out fr
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

//itrate in decending order

		Iterator it = ht.descendingIterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
		// inserting an elements at the 1st and last position

		ht.addFirst("KADU");
		ht.addLast("final");

		System.out.println(ht);
		// creating new lis
		LinkedList<String> ht1 = new LinkedList<>();

		ht1.add("a");
		ht1.add("kajal");

		System.out.println(ht1);
		ht.addAll(2, ht1);
		System.out.println(ht);

		// occurance

		String a = ht.getFirst();

		String b = ht.getLast();

		System.out.println(a);
		System.out.println(b);

		// display elements

		for (int i = 0; i < ht.size(); i++) {

			System.out.println("ELEMENTS:" + i + "IS" + ht.get(i));
		}

		// removal

		// ht.remove(2);
		// System.out.println(ht);

		// ht.removeAll(ht);

		// System.out.println(ht);

		ht1.removeFirst();

		// ht.removeLast();

		System.out.println(ht1.removeFirst());

		// System.out.println(ht.removeLast());

		// SWAP

		Collections.swap(ht, 0, 3);

		System.out.println(ht);
//add

		LinkedList<String> j = new LinkedList<>();
		j.addAll(ht);

		j.addAll(ht1);
		System.out.println(j);

		// search elements

		if (ht.contains("kajal")) {
			System.out.println("YES");

		} else {

			System.out.println("no");
		}
		// converting list into array list

		List<String> abs = new ArrayList<String>(ht);

		System.out.println(abs);

		// compare

		LinkedList<String> ht2 = new LinkedList<>();

		for (String q : ht) {

			ht2.add(ht1.contains(q) ? "yes" : "NO");
			System.out.println(ht2);
		}

	}

}
