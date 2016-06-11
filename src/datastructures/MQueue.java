package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class MQueue<E> {

	private Queue<E> q;
	
	public MQueue(){
		q = new LinkedList<E>();
	}
	
	public void add(E e) {
		q.add(e);
	}
	public E remove() {
		return q.remove();
	}
	
	public E getFirst() {
		return q.element();
	}
	
	public boolean isEmpty() {
		return q.isEmpty();
	}
}
