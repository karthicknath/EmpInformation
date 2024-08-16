package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	public void empName() {
		System.out.println("KARTHICK NATH");

	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empName();
		
		Company com = new Company();
		com.companyName();
		
		Client cl = new Client();
		cl.clientName();
		
		Project pro = new Project();
		pro.projectName();
		
		
		
	}
}
