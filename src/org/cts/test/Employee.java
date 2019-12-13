package org.cts.test;

public class Employee {
	static Employee e=null;

	private Employee() {

}
	static Employee get() {
		if (e==null) {
			e= new Employee();
		}
		return e;
	
	}

public void empId() {
	System.out.println("employee id is 111");
}
public static void main(String[] args) {
	Employee emp=get();
	System.out.println(emp);
	emp.empId();
}
}