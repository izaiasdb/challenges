package java2blog;

import java.util.List;
import java.util.Optional;

public class Question18 {
	
	/*
	 * 18) Given the list of employees, find the employee with name “Mary”.
	 */
	public static void main(String[] args) {
		List<Employee> list = Employee.createEmployeeList();
		
		//Optional<Employee> employee = list.stream().filter(c-> c.getName().equalsIgnoreCase("Mary")).findAny();
		// or
		Optional<Employee> employee = list.stream().filter(c-> c.getName().contains("Mary")).findAny();
		
		if (employee.isPresent()) {
			System.out.println(employee.get());
		}
		
	}
}
