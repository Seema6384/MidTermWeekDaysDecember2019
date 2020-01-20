package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

				Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();
				lmap.put(12, "Mahesh");
				lmap.put(5, "Naresh");
				lmap.put(23, "Suresh");
				lmap.put(9, "Sachin");
				System.out.println("LinkedHashMap before modification" + lmap);
				System.out.println("Is Employee ID 12 exists: " +lmap.containsKey(12));
				System.out.println("Is Employee name Amit Exists: "+lmap.containsValue("Amit"));
				System.out.println("Total number of employees: "+ lmap.size());
				System.out.println("Removing Employee with ID 5: " + lmap.remove(5));
				System.out.println("Removing Employee with ID 3 (which does not exist): " + lmap.remove(3));
				System.out.println("LinkedHashMap After modification" + lmap);
			}
		}



