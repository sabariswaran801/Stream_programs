package com.stream.methods;

import java.util.Comparator;
import java.util.List;

import com.models.Employee;

public class SortedMethod {
	
	public static void main(String[] args) {
		
		// sorts the elements based on natural and custom shorting
		
		
		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000));
		
		System.out.println(lst);
		
		List<Employee> list = lst.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
		
		System.out.println(list);
		
	}

}