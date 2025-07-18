package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class AllMatchMethod {
	
	public static void main(String[] args) {
		
		
		// Match method will return true or false based on the input
		
				List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "muthu", 3000),
						new Employee(3, "muthu", 2000), new Employee(3, "muthu", 7000), new Employee(13, "muthu", 9000));
				
				boolean allMatch = lst.stream().allMatch(i->i.getName().equals("muthu"));
				
				System.out.println(allMatch);
				
		
	}

}
