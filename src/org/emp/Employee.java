package org.emp;

import org.com.Company;

public class Employee {
	private void empId() {
		System.out.println("0079");
	}
	private void empBloodGroup() {
		System.out.println("B+ve");
	}
	private void empName() {
		System.out.println("Pream");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.compId();
		c.comName();
		Employee e = new Employee();
		e.empId();
		e.empName();
	}
}
