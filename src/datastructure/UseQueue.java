package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue queueA = new LinkedList();

		queueA.add("element 0");
		queueA.add("element 1");
		queueA.add("element 2");

//access via Iterator
		Iterator iterator = queueA.iterator();
		while(iterator.hasNext())
		{
			String element = (String) iterator.next();
		}

//access via new for-loop
		for(Object object : queueA) {
			String element = (String) object;
		}
	}

}
