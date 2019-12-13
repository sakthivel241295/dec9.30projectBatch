package org.cts.test;

public class Sd {
public static void main(String[] args) {
	System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	try {
		
		System.out.println(4/0);
		}catch (ArithmeticException e) {System.out.println("dnot");}
	
			
			finally {System.out.println("success");
		}
		
		System.out.println(5);
	

}
}