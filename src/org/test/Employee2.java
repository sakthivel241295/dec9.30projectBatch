package org.test;

public class Employee2 {
	static Employee2 e=null;
	private Employee2() {

}public static  Employee2 getInstance() {
	if(e==null) {
		e=new Employee2();
		
		
	}return e;
	 
	
}public void empId() {
	System.out.println("employee id is");
}public static void main(String[] args) {
	Employee2 empId=getInstance();
	System.out.println(empId);
}
	
}
