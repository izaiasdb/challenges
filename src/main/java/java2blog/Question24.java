package java2blog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question24 {
	
	/*
	 * 24) Given the list of numbers, remove the duplicate elements from the list.
	 */
	public static void main(String[] args) {
		Integer[] numbers = new Integer[] {1,2,3,4,3,2,4,2};
		
		List<Integer> list = Arrays.asList(numbers);
//		list.forEach(c-> System.out.println(c));
//		Set<Integer> noRepeatedList = list.stream().collect(Collectors.toSet());
		//or
		List<Integer> noRepeatedList = list.stream().distinct().collect(Collectors.toList());
		noRepeatedList.forEach(c-> System.out.println(c));
	}
}
