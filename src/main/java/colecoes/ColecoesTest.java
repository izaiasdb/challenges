package colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class ColecoesTest {
	public static void main(String[] args) {
//		arrayListTest();
//		hashSetTest();
//		linkedHashSetTest();
//		treeSetTest();
		priorityQueueTest();
		
	}
	
	private static void arrayListTest() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(3);
				
		System.out.println(list);
		list.add(2);
		System.out.println(list);
		System.out.println(list.get(1));
	}
	
	private static void hashSetTest() {
		Set<Integer> list = new HashSet<>();
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		list.add(2);
		System.out.println(list);
//		System.out.println(list.get(1));
		
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
	
	private static void linkedHashSetTest() {
		Set<Integer> list = new LinkedHashSet<Integer>();
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		list.add(2);
		System.out.println(list);
//		System.out.println(list.get(1));
	}
	
	private static void treeSetTest() {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);

		Iterator<Integer> iterator = tree.iterator();
		System.out.print("Tree set data: ");
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		}
	}
	
	private static void priorityQueueTest() {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
	
	

}
