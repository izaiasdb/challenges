package java2blog;

import java.util.List;
import java.util.OptionalInt;

public class Question19 {
	
	/*
	 * 19)Given a list of employee, find maximum age of employee?
	 */
	public static void main(String[] args) {
		List<Employee> list = Employee.createEmployeeList();
		
		OptionalInt age = list.stream().mapToInt(Employee::getAge).max();
		
		if (age.isPresent()) {
			System.out.println(String.format("The max age is %s", age.getAsInt()));
		}
		
	}
}
