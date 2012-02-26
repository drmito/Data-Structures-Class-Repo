package data_structures;

import java.util.Iterator;

/**
 * An interface that LinkedList code must implement.
 * @author Rob Edwards
 *
 * @param <E> The generic object that will be stored in your linked list!
 */
public interface ListI<E> extends Iterable<E> {


	/**
	 * Adds the Object obj to the beginning of the list
	 * @param obj the object to add
	 */
	public void addFirst(E obj);

	/**
	 * Adds the Object obj to the end of the list
	 * @param obj the object to add
	 */
	public void addLast(E obj);

	/**
	 * Removes the first Object in the list and returns it.
	 * @return the first object in the list or null if the list is empty.
	 */
	public E removeFirst();

	/**
	 * Removes the last Object in the list and returns it.
	 * @return the last object in the list or null if the list is empty.
	 */
	public E removeLast();

	/**
	 * Returns the first Object in the list, but does not remove it.
	 * @return the first object in the list or null if the list is empty.
	 */
	public E peekFirst();

	/**
	 * Returns the last Object in the list, but does not remove it.
	 * @return the last object in the list or null if the list is empty.
	 */
	public E peekLast();

	/**
	 * The list is returned to an empty state.
	 */
	public void makeEmpty();

	/**
	 * Is the list empty?
	 * @return true if the list is empty, otherwise false
	 */
	public boolean isEmpty();

	/**
	 * Is the list full? 
	 * @return true if the list is full, otherwise false
	 */
	public boolean isFull();

	/**
	 * The size of the list
	 * @return the number of Objects currently in the list.
	 */
	public int size();

	/**
	 * Check to see if an object is in the list
	 * @param obj  the object to look for
	 * @return whether the list contains the object
	 */
	public boolean contains(E obj);

	/** 
	 * Returns an Iterator of the values in the list, presented in
	 * the same order as the list.
	 */
	public Iterator<E> iterator();

}


