package java2blog;

import java.util.List;
import java.util.stream.Collectors;

public class Question16 {
	
	/*
	 * 16) Given a list of employees, you need to filter all the employee whose 
	 * age is greater than 20 and print the employee names.(Java 8 APIs only)
	 */
	public static void main(String[] args) {
		List<Employee> list = Employee.createEmployeeList();
		
		list.stream().filter(c-> c.getAge() > 20).collect(Collectors.toList()).forEach(c-> {
			System.out.println(c.getName());
		});
		
		List<String> names = list.stream().filter(c-> c.getAge() > 20).map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);
		names.forEach(name -> System.out.println(name));
	}
}
