package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class hasmapex {
public static void main(String[] args) {
	
	HashMap<Integer,Integer>hashmap=new HashMap<>();
	
	hashmap.put(1, 91456);

	hashmap.put(2, 91454);

	hashmap.put(3, 91452);

	hashmap.put(4, 91451);
	
	
	Set<Integer> keys= hashmap.keySet();
	
	for (Integer key : keys) {
		
	System.out.println(key);
	  
	         Integer value=  hashmap.get(key);
		
	         System.out.println(value);
	}
	///for getting values only...use this ..method
Collection<Integer> value=	hashmap.values();

System.out.println(value);
	
}
}
