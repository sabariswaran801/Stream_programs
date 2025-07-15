package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class CountMethod {
	
	public static void main(String[] args) {
		
		
		//count used to count the elements
		

		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000));
		long count = lst.stream().filter(i->i.getId()==3).count();
		
		System.out.println(count);
	}

}
