package java2blog;

import java.util.Collections;
import java.util.List;

public class Question20 {
	
	/*
	 * 20) Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only
	 */
	public static void main(String[] args) {
		List<Employee> list = Employee.createEmployeeList();
		list.sort((e1,e2)->e1.getAge()-e2.getAge());
//		list.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
//		Collections.sort(list, (e1,e2)->e1.getName().compareTo(e2.getName()));
		
		list.forEach(c->{
			System.out.println(c);
		});
	}
}
