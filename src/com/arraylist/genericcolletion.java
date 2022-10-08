package com.arraylist;

import java.util.ArrayList;

public class genericcolletion {
public static void main(String[] args) {
	
	
	ArrayList<Integer>ar1=new ArrayList<>();
	
	ar1.add(10);
	ar1.add(22);
	ar1.add(422);
	ar1.add(52);
	ar1.add(42);
	
	//SOME METHODS ARE USED..>>LIKE REMOVE,SET,GET ETS..
	System.out.println(ar1);
	Integer a=	ar1.get(2);
	System.out.println(a);
	
	Integer aa=ar1.remove(1);
	System.out.println("removed index 1 object");
	System.out.println(aa);
	System.out.println(ar1);
	ar1.set(3, 444);//setting element at index positon
	System.out.println(ar1);
	
	
	
}
}
