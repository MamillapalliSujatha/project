package com.objectExample1;

public class Driver {

	public static void main(String[] args) {
		Driver d=new Driver();
		Employee e=new Employee();
		e.id=101;
		e.salary=20000.00;
		d.print(e);
	}
	void print(Employee e) {
		System.out.println(e.id+" "+e.salary);
	}

}
