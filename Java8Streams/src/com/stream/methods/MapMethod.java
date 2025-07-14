package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class MapMethod {

	public static void main(String[] args) {

		// Map method --> transforms each method

		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000));
		
		lst.stream().map(e->e.getName().toUpperCase()).forEach(System.out::println);

	}		

}
