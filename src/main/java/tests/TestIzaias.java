package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
JS Challenge
Having a list of n digits (0 <= digit <= 9), where n less than or equal to 100, 
arrange it to move all 0 to right in O (n) time.

Example [4, 8, 0, 9, 2, 5, 0, 3, 3, 0] -> [4, 8, 9, 2, 5, 3, 3, 0, 0, 0]

You must display this list in the console.

After this, the previous list without zeros ([4, 8, 9, 2, 5, 3, 3]) will represent a fictitious integer (4892533). 
You should add 1 unit to it, leaving the final list as [4, 8, 9, 2, 5, 3, 4]. You must display this list in the console.

Finally, multiply by -1 each digit in even position of the array without zeros. After this, detect the sub-array, 
whose sum of digits is the maximum and return this sum. 
Example: [4, 8, 9, 2, 5, 8, 4, 9] -> [-4, 8, -9, 2, -5, 8, -4, 9] -> 13. 
You must display the sum in the console.
 */
public class TestIzaias {
	public static void main(String[] args) {
		Integer[] array = new Integer[] {4, 8, 0, 9, 2, 5, 0, 3, 3, 0};
		
		//Remove zeros
		List<Integer> list = arrayWithoutZero(array);
		step02(list);
		
		List<Integer> multiplyedList = step03(Arrays.asList(4, 8, 9, 2, 5, 8, 4, 9), -1);
		
		Integer sum = step04(multiplyedList);
		System.out.println(sum);			
	}
	
//	public static List<Integer> arrayWithoutZero(Integer[] array) {
//		List<Integer> newList = new ArrayList<Integer>();
//		List<Integer> zeroList = new ArrayList<Integer>();
//		List<Integer> sortedList = new ArrayList<Integer>();
//		
//		for (Integer value : array) {
//			if (value > 1) {
//				newList.add(value);
//			} else {
//				zeroList.add(value);
//			}
//		}
//		
//		sortedList.addAll(newList);
//		sortedList.addAll(zeroList);
//		
//		System.out.println(sortedList);
//		
//		return newList;
//	}
	
	// Option 2
	public static List<Integer> arrayWithoutZero(Integer[] array) {
		List<Integer> withoutZero = Arrays.asList(array);
		List<Integer> zeroList = Arrays.asList(array);
		List<Integer> sortedList = new ArrayList<Integer>();
		
		withoutZero = withoutZero.stream().filter(item -> item != 0).collect(Collectors.toList());
		zeroList = zeroList.stream().filter(item -> item == 0).collect(Collectors.toList());
		
		sortedList.addAll(withoutZero);
		sortedList.addAll(zeroList);
		
		System.out.println(sortedList);
		
		return withoutZero;
	}
	
	public static List<Integer> step02(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		String valueS = "";
		
		for (Integer integer : list) {
			valueS += integer;
		}
		
//		valueS = String.valueOf(Integer.parseInt(valueS) + 1);
		System.out.println(valueS);
//		String valueS = list.toString();
		
		list.set(list.size() -1, list.get(list.size()-1) + 1);
		
		System.out.println(list);
//		
//		int total = 0;
//		for (Integer i : list) { // assuming list is of type List<Integer>
//		    total = 10*total + i;
//		}
		
//		for (int i = 0; i < valueS.length(); i++) {
//			newList.add(Integer.parseInt(String.valueOf(valueS.charAt(i))));
//		}
		
		return newList;
	}
	
	public static List<Integer> step03(List<Integer> list, int number) {
		List<Integer> newList = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				newList.add(list.get(i) * number);	
			} else {
				newList.add(list.get(i));
			}
		}
		
//		for (Integer value : list) {
//			if (value % 2 == 0) {
//				newList.add(value * number);	
//			} else {
//				newList.add(value);
//			}
//		}
		
		System.out.println(newList);
		
		return newList;
	}
	
	private static Integer step04(List<Integer> list) {
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		List<Integer> subList = list.subList(sum, list.size());
		System.out.println(subList);
		return subList.stream().mapToInt(Integer::intValue).sum();
	}	
}
