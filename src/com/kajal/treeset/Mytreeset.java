package com.kajal.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Mytreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ht1=new TreeSet<>();
		
		
		ht1.add("a");
		ht1.add("b");
		ht1.add("n");
		ht1.add("a");
		ht1.add("s");
		ht1.add("sr");
		
		System.out.println(ht1);
		
//iterat
		
		Iterator<String> str=ht1.iterator();
		
		while(str.hasNext()) {
			
			System.out.println(str.next());
			
			
		}
		
		//creating nw tree set
		
		TreeSet<String> ht2=new TreeSet<>();

		ht2.add("h");
		ht2.add("d");
		ht2.add("e");
		ht2.add("r");
		
		System.out.println(ht2);
		
		//adding
		
	ht1.addAll(ht2);
	System.out.println(ht1);
	//reverse order
	
	Iterator<String> st=ht1.descendingIterator();
	
	while(st.hasNext()) {
		
		System.out.println(st.next());
		
		
	}
	
	
	//GET 1ST AND LAST ELEMENTS
	
ht1.first();
	
	
	System.out.println(ht1.first());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
