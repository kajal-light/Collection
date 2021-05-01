package com.kajal.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class myhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> ht1=new HashSet<>();
		
		HashSet<String> ht2=new HashSet<>();
		//HashSet<String> ht2=new HashSet<>();
		//adding elements in ht1
		ht1.add("apple");
		ht1.add("orange");
		ht1.add("white");
		ht1.add("black");
		ht1.add("kajal");
		System.out.println(ht1);
		
		//iterate
		
		Iterator<String> hh=ht1.iterator();
		
		while(hh.hasNext()) {
			
			System.out.println(hh.next());
			
			
		}
		
		
		//get the number in haset
		System.out.println(ht1.size());
		
		//empty
		
		
		//ht1.removeAll(ht1);
		
		//System.out.println(ht1);
		
		
		//chk empty or not
		
		
		//System.out.println(ht1.isEmpty());
		
		//CONVERT HASHSET INTO ARRAY
		
		String[] arr=new String[ht1.size()];
		
		ht1.toArray(arr);
		for(String e:arr) {
		
		
		System.out.println(e);
		
	}
		
	//convert hashset in to tree set	
		
		
		
		
		Set<String> a=new TreeSet<>(ht1);
		
		
		for(String e:a) {
			
			
			System.out.println(e);
		}
		
		//convert hashset to array list
		
		List<String> b=new ArrayList<>(ht1);
		

		for(String e:b) {
			
			
			System.out.println(e);
		}
		
		
		
		//compare 
		
		ht2.add("a");
		
		ht2.add("b");
		
		System.out.println(ht1.contains(ht1)? "yes":"no");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
