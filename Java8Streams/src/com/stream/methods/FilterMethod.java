package com.stream.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.models.Employee;

public class FilterMethod {

	public static void main(String[] args) {
		
		// filter method ---> filter using condition

		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000));
		
		System.out.println(lst);
		
		List<Employee> list = lst.stream().filter(e->e.getSalary()>5000).toList();
		
		System.out.println(list);

		
		
		
		
	}

}
