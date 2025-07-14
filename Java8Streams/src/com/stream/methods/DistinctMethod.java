package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class DistinctMethod {

	public static void main(String[] args) {

		// Distinct method --> flatten the nested map

		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000),
				new Employee(11, "ram", 3000), new Employee(13, "muthu", 9000));

		System.out.println("Before removing " + lst);
		List<Employee> list = lst.stream().distinct().toList();
		System.out.println("after removing " + list);

	}

}
