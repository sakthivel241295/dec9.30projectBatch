package org.test;

import java.util.Scanner;

public class Rt {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter the String s1");
		String s=sa.next();
		System.out.println();
		System.out.println("enter the string s2");
		String d=sa.next();
		System.out.println();
		
  //t find the length f the string
		int w = s.length();
		
	System.out.println("length of the string is" +w);
	//to pick one letter from the string
	char r = s.charAt(6);
	System.out.println("letter of the string is"  +r);
	//convert to upper case
	String e = s.toUpperCase();
	System.out.println(e);
	
	//convert to lower case
	
	String   t=s.toLowerCase();
	System.out.println(t);
	//whether the string is starts with r not
	boolean b = s.startsWith("sak");
	System.out.println(b);
	
	//whether the string is ends with r not
	boolean c = s.endsWith("vel");
	System.out.println(c);
	//index of
	 int d1= s.indexOf("t");
	 System.out.println(d1);
		//last index
	 int f1 = s.lastIndexOf("l");
	 System.out.println(f1);
	 //whether the string is present or nt
	 
	 boolean f = s.contains("sakthi");
	 System.out.println(f);
	 //t compare two string 
	 boolean g = s.equals("d");
	 System.out.println(g);
	 
	//to compare two string without case
	 boolean h = s.equalsIgnoreCase("d");
	 System.out.println(h);
	// jin two string
	 String v=s.concat(d);
	 System.out.println(v);
	// change one letter to another letter
	 String j = s.replace("sakthivel", "welcome");
	 System.out.println(j);
	// remove unwanted spaces in start and last
	 String l = s.trim();
	 System.out.println(l);
	 //to take small string from string
	 String n = s.substring(5);
	 System.out.println(n);
	 s.substring(4, 7);
	 
	 
	
	
	
	
	
}

}
