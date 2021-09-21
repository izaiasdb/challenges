package java2blog;

import java.util.List;
import java.util.stream.Collectors;

public class Question21 {
	
	/*
	 * 21) Join the all employee names with “,” using java 8?
	 */
	public static void main(String[] args) {
		List<Employee> list = Employee.createEmployeeList();
		
		List<String> names = list.stream().map(Employee::getName).collect(Collectors.toList());
		
		System.out.println(String.join(",", names));
	}
}
