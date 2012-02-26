package data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements ListI<E> {
	class IteratorHelper <E> implements Iterator<E> {
		}
	public interatorHelper() {
		public boolean hasNext() {
		}
		public E Next{
			if (!= hasNext)
				throw new NoSuchElementException(); 
		}
		public void remove {
			throw new UnsupportedOperationException();
		
		}
	}
	ListI implements iterable<E> {
		@SuppressWarnings("rawtypes")
		public Iterator Iterator(){
			return IteratorHelper();
	}
	class Node<E> {
		E data;
		Node<E> next;
		
		public Node(E obj); {
			data=obj;
			next=null;
		}
		private Node<E> head, tail;
		private int counter;
		public LinkedList() {
			head=null;
			counter=0;
		}
		public LinkedList() {
			head=tail=null;
		}
	}

	@Override
	public void addFirst(E obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(E obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeEmpty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(E obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}