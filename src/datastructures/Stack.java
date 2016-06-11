package datastructures;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {

	private List<T> stack;
	public Stack(){
		stack = new LinkedList<T>();
	}
	
	public void push(T t){
		stack.add(t);
	}
	
	public T pop() {
		return stack.remove(stack.size()-1);
	}
	
	public T top() {
		return stack.get(stack.size()-1);
	}
}
