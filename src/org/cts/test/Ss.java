package org.cts.test;

public class Ss {
	 static int a=5;
	 int b=4;
	private  Ss() { 
		
		System.out.println(a);
		System.out.println(b);
		a++;
		b++;
	}public static void main(String[] args) {
		
		
		Ss w=new Ss();
		Ss d=new Ss();
		System.out.println(a);
		System.out.println(a);
		
		
	}

}
