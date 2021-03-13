package stackDS;

import java.util.ArrayList;

/*
 * Stack implementation using ArrayList 
 */

public class Stack<E> {

	private ArrayList<E> array;
	
	public Stack() {
	    array = new ArrayList<>();
	}
	
	public void push(E data) {
		array.add(data);
	}
	
	public boolean pop() {
		
		if(isEmpty()) {
			return false;
		}
		
		 array.remove(array.size() - 1);
		 return true;
	}
	
	public boolean isEmpty() {
		 return array.isEmpty();
	}
	
	public E top() {
		return array.get(array.size() - 1);
	}
	
}
