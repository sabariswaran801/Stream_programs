package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class AnyMatchMethod {
	
	public static void main(String[] args) {
		
		// Match method will return true or false based on the input
		
		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000));
		
		
		
		 if(lst.stream().anyMatch(i->i.getSalary()==2000)) {
			 System.out.println("is preset");
		 }
	}
	

}