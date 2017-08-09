package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Rahul");  
		al.add("Sri");  
		al.add("Praveen");  
		al.add("Appi");  
		  
		Collections.sort(al);  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());

  }
		
	}	
	
}


