/**
 * 
 */
package testCode;

import data_structures.LinkedList;
import data_structures.ListI;

/**
 * @author Rob Edwards
 * @version $Id: LinkedListTester.java,v 1.1.1.1 2012/02/15 23:28:44 masc0577 Exp $
 * 
 * This code is designed to help you test your Linked List code. It will create a generic linked list,
 * add some elements, and remove some elements. It is designed to work with a linked list program
 * called LinkedList.java that is in the data_structures package. You should create a package called 
 * testCode to house this, and other test code that you write for your self.
 *
 * This code will catch several common errors, but is not guaranteed to catch all errors! You should 
 * think about your code and add test cases too!
 * 
 */
public class LinkedListTester {

	static ListI<Integer> llist = null;

	/**
	 * @param args
	 * The main method. In this case, we don't accept any arguments. We create a new linked list object
	 * and fill it with Integers.
	 */
	public static void main(String[] args) {
		
		System.out.println("Testing the linked list");

		try {
			llist = new LinkedList<Integer>();

			// add n elements to the list
			int n = 25;
			for (int i=1; i<=n; i++)
				llist.addFirst(i);

			// the size should be n
			if (llist.size() != n)
				System.err.println("We added " + n + " elements to the start of the list, but the size reported was " + llist.size());

			// check the list with the iterator. If n = 25, this should print
			// 25 24 23 22 21 ... 5 4 3 2 1
			System.out.print("Printing 25 to 1: ");
			for (Integer i : llist)
				System.out.print(i + " ");
			System.out.println();

			// remove from the front of the list ... should be in the order n .. 1
			for (int i=n; i>0; i--) {
				int removed = llist.removeFirst();
				if (removed != i)
					System.err.println("Remove first returned " + removed + " but expected " + i);
			}

			// the size should be 0
			if (llist.size() != 0)
				System.err.println("We removed everything from the list, but the size is still " + llist.size());


			// now test the add last methods
			for (int i=1; i<=n; i++)
				llist.addLast(i);

			if (llist.size() != n)
				System.err.println("We added " + n + " things to the list, but the size is " + llist.size());

			// iterate through and print out the results
			// these should be in the opposite order from before.
			System.out.print("Printing 1 to 25: ");
			for (Integer i : llist)
				System.out.print(i + " ");
			System.out.println();

			// and remove last
			for (int i=n; i>0; i--) {
				int removed = llist.removeLast();
				if (removed != i)
					System.err.println("Remove last returned " + removed + " but expected " + i);
			}

			// add some things again
			for (int i=1; i<=n; i++)
				llist.addFirst(i);
			
			// now keep adding last and removing last and making
			// sure that we have updated the tail pointer
			for (int i=1; i<=n; i++) {
				llist.addLast(i);
				int removed = llist.removeLast();
				if (removed != i)
					System.err.println("Remove last returned " + removed + " but expected " + i);
			}

			// now make the list empty
			llist.makeEmpty();

			// is the size 0?
			if (llist.size() != 0)
				System.err.println("We made the list empty, but the size is still " + llist.size());

			// now add one thing to the list
			llist.addLast(n+1);

			// this should be the only thing in the list
			for (int i : llist)
				if (i != (n+1))
					System.err.println("There should be only one thing in the list, but we got " + i);

			// make empty again
			llist.makeEmpty();

			// now play at adding/removing
			llist.addFirst(n+2);
			llist.removeFirst();
			llist.addLast(n+3);

			// this should be the only thing in the list
			for (int i : llist)
				if (i != (n+3))
					System.err.println("There should be only one thing in the list, but we got " + i);

			if (llist.removeFirst() != n+3)
				System.err.println("We should have removed " + (n+3) + " from the list but didn't");

			if (llist.removeFirst() != null)
				System.err.println("The list should be empty and not be able to remove anything and should return null");

			if (llist.removeLast() != null)
				System.err.println("The list should be empty and not be able to remove anything and should return null");
			
			System.out.println("Tests completed");
		
		}
		catch (Exception e) {
			System.err.println("Your linked list code threw an exception. You need to fix this." +
			" Take a look at this stack trace to see what is wrong:");
			e.printStackTrace();
		}

	}
}
