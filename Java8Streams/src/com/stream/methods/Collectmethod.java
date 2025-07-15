package com.stream.methods;

import java.util.List;
import java.util.stream.Collectors;

import com.models.Employee;

public class Collectmethod {
	
	public static void main(String[] args) {
		
		
		//collect used to collect the elements
		List<Employee> lst = List.of(new Employee(23, "muthu", 4000), new Employee(11, "ram", 3000),
				new Employee(3, "manju", 2000), new Employee(3, "gowri", 7000), new Employee(13, "muthu", 9000));
		
		List<Employee> collect = lst.stream().filter(i->i.getName().startsWith("r")).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
		
		
	}

}
