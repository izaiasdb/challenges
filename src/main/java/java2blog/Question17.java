package java2blog;

import java.util.List;

public class Question17 {
	
	/*
	 * 17) Given the list of employees, count number of employees with age 25?
	 */
	public static void main(String[] args) {
		List<Employee> list = Employee.createEmployeeList();
		
		long count = list.stream().filter(c-> c.getAge() > 20).count();
		System.out.println(String.format("The quantity of employees with age greater than 25: %s", count));
	}
}
