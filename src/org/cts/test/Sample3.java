package org.cts.test;

public class Sample3 extends Sample848 {
	public Sample3() {
		super (200);
		System.out.println("default constructor");
	}
	public Sample3(int id) {
System.out.println("int para constructor");
}public static void main(String[] args) {
	Sample3 d=new Sample3();
	Sample3 r=new Sample3(30);
}
}