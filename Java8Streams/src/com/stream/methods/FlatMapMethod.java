package com.stream.methods;

import java.util.List;

import com.models.Employee;

public class FlatMapMethod {

	public static void main(String[] args) {

		// Flat Map method --> flatten the nested map

		List<List<Employee>> lst = List.of( List.of(new Employee(23, "muthu", 4000),new Employee(11, "ram", 3000)),
				 List.of(new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000)));
		

		lst.stream().flatMap(List::stream).forEach(e->System.out.println(e.toString()));
		
	}

}
