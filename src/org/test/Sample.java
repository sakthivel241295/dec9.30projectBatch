package org.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		Set<Employee> k=new HashSet();
		//to get emp information
		
	Employee e=new Employee();
	e.setId(288);
	e.setName("sakthivel");
	e.setPhno(8883777062l);
	
	
	//to get emp2 information
	Employee t=new Employee();
	t.setId(555);
	System.out.println();
	t.setName("gopi");
	t.setPhno(8883237366l);
	k.add(e);
	k.add(t);
	
	/*
	for (int i = 0; i <k. size(); i++) {
		System.out.println(k.get(i).getId());
		System.out.println(k.get(i).getName());
		System.out.println(k.get(i).getPhno());*/
	
	
	for (Employee e1 : k) {
		System.out.println(e1);
		System.out.println(e1.getName());
		System.out.println(e1.getPhno());
		
		
		
	}
		
	}
	}

		
	

	


