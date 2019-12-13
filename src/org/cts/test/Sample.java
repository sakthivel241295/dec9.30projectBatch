package org.cts.test;

public class Sample {
	public Sample() {this(10);
		System.out.println("default constructor");
	}
	
//paramatrized contractor
	public Sample(int id ) {
		this("nisha");
		System.out.println("int para constructor");
		System.out.println(id);
		
	}
 public  Sample(String name) {
	 this("nishaf@383",1234.333f);
	 System.out.println(" string paracontrutor");}
 
 public Sample(String email,float sal) {
	 System.out.println("string kloat para constructor");
	 System.out.println(email);
	 System.out.println(sal);
 }
	 
 public static void main(String[] args) {
	Sample s=new Sample();

	
	
}
}
