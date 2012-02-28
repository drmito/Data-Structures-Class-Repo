package data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements ListI<E> {

@SuppressWarnings("hiding")
class Node<E> {
	E data;
	Node<E> next;
	
	public Node(E obj) {
		data=obj;
		next=null;
	}
}
	private Node<E> head, tail;
	private int counter;
	public LinkedList() {
		head=null;
		tail=null;
		counter=0;
	}
	public void addFirst(E obj) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Node<E> node = new Node(obj);
		if(head==null)
			tail=node;
		node.next=head;
		counter++;
		head=node;
	}
	public void addLast(E obj) {
		if(head==null)
			addFirst(obj);
		else{
			Node<E> newnode = new Node<E>(obj);
			tail.next=newnode;
			tail=newnode;
			counter++;
		}
	}
	public E removeFirst() {
			if(head==null)
				return null;
			E tmp = head.data;
			head = head.next;
			counter--;
			return tmp;
		}
	public E removeLast() {
		if(head==null){return null;}
		if(head.next==null){return removeFirst();}
		Node<E> current = head;
		Node<E> previous = null;
		while(current.next != null){
			previous=current;
			current=current.next;
		}
		tail=previous;
		previous.next=null;
		counter--;
		return current.data;
	}

	public E peekFirst() {
		if(head==null)
			return null;
		return tail.data;
	}

	public E peekLast() {
		if(head==null)
			return head.data;
		return tail.data;
	}

	public void makeEmpty() {
		head = null;
		tail = null;
		counter = 0;
	}

	public boolean isEmpty() {
		return (head==null);
	}

	public boolean isFull() {
		return (head != null);
	}

	public int size() {
		return counter;
	}

	@SuppressWarnings("unchecked")
	public boolean contains(E obj) {
	Node<E> tmp = head;
	while(tmp != null){
		if(((Comparable<E>) tmp.data).compareTo(obj) == 0)
			return true;
		tmp=tmp.next;
	}
		return false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Iterator iterator() {
		return new IteratorHelper();
	}	

public class IteratorHelper implements Iterator<E> {
		Node<E> position;
	
		public IteratorHelper(){
			position = (Node<E>) head;
	}
		public boolean hasNext() {
			return position != null;
		}
		public E next(){
			if (!hasNext())
				throw new NoSuchElementException(); 
		E tmp = position.data;
		position = position.next;
		return tmp;
		}
		public void remove(){
			throw new UnsupportedOperationException();	
	}
}
}
