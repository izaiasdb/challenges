package java2blog;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question22 {
	
	/*
	 * 22) Given the list of employee, group them by employee name?
	 */
	public static void main(String[] args) {
		List<Employee> list = Employee.createEmployeeList();
		
		Map<String, List<Employee>> groupList = list.stream().collect(Collectors.groupingBy(Employee::getName));
		
		groupList.forEach((name, obj) ->{
			System.out.println(String.format("The name %s and the object %s ", name, obj));
		});
	}
}
