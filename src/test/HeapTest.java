package test;

import datastructures.Heap;

public class HeapTest {
	
	private static void minHeapTest() {
		Heap<String> heap = new Heap<String>(true, 10);
		heap.insert("hanish");
		heap.insert("gogada");
		if(heap.reomve().equals("gogada")) 
			System.out.println("Pass");
		if(heap.reomve().equals("hanish")) 
			System.out.println("Pass");
	}
	private static void maxHeapTest() {
		Heap<String> heap = new Heap<String>(false, 10);
		heap.insert("hanish");
		heap.insert("gogada");
		if(heap.reomve().equals("hanish")) 
			System.out.println("Pass");
		if(heap.reomve().equals("gogada")) 
			System.out.println("Pass");
	}
	
	public static void main(String arg[]) {
		minHeapTest();
		maxHeapTest();
		
		
	}
}
