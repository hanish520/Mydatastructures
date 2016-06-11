package datastructures;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap<T> {
	
	private Queue<T> heap;
	public Heap(boolean min, int initialsize) {
		if(!min) 
			heap = new PriorityQueue<T>(initialsize, Collections.reverseOrder() );
		else
			heap = new PriorityQueue<T>(initialsize);
	}
	public Heap(int initialsize, Comparator<? super T> comp) {
     heap = new PriorityQueue<T>(initialsize,comp);
	}
	
	public boolean insert(T t) {
		return heap.add(t);
	}
	
	public T reomve() {
		if(heap.isEmpty()) {
			System.out.println("No element to remove \n");
			return null;
		}
		return heap.poll();
	}
	
	public boolean isPresent(T t) {
		return heap.contains(t);
	}
}