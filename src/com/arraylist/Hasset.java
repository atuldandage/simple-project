package com.arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hasset {
public static void main(String[] args) throws Exception {
	

	Set<Integer>set=new HashSet<>();
	
	set.add(1113);
	set.add(2224);
	set.add(3331); 
	set.add(4442);
	set.add(5552);
	set.add(null);
	//set.add(null);
	// System.out.println(set); 
	Iterator<Integer> ss=   set.iterator();
	 while(ss.hasNext()) {
		Integer  pp= ss.next();
		System.out.println(pp);
		//System.out.println(ss.next());
	 }
	
	 HashSet<String>ad=new HashSet<String>();
	 ad.add("acc");
	 ad.add("bdd");
	 ad.add("cvv");
	 ad.add("dcc"); 
	 System.out.println(ad);
	 
}	
	
}
