package com.stream.methods;

import java.util.List;
import java.util.stream.Stream;

import com.models.Employee;

public class LimitMethod {

	public static void main(String[] args) {

		// limits the results

		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000));

		List<Employee> list = lst.stream().limit(2).toList();
		
		System.out.println(list);
		
		

	}

}
