package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorUse {
public static void main(String[] args) {
	
	ArrayList<String> ar=new ArrayList<>();
	
	ar.add("hello");
	ar.add("atul");
	ar.add("raju");
	  
	//System.out.println(ar);
	
	
	Iterator<String>string=ar.iterator();
	while(string.hasNext()) {
	String itr=	string.next();

	System.out.println(itr);
String s2=	itr.substring(0, 2);
	System.out.println(s2);
	}
	String s3= ar.get(2);
	System.out.println(s3);
}
}
