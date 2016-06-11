package datastructures;

import java.util.LinkedList;
import java.util.List;

public class SLL<T> {
    
	private List<T> list;
	public SLL() {
		list = new LinkedList<T>();
	}
	
	public void add(T t){
		list.add(t);
	}
	
	public T remove(){
		return list.remove(0);
	}
}
