package datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap<T> {
	
	private Queue<T> heap;
	private boolean min;
	public Heap(boolean min, int initialsize) {
		heap = new PriorityQueue<T>(initialsize);
		this.min=min;
	}
	public Heap(boolean min, int initialsize, Comparator<? super T> comp) {
     this.min=min;
     heap = new PriorityQueue<T>(initialsize,comp);
	}
	
	public boolean insert(T t) {
		return heap.add(t);
	}
	
	public T reomve(T t) {
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