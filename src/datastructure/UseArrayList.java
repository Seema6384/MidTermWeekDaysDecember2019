package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
          */



				List<String> langs = new ArrayList<>();

				langs.add("Java");
				langs.add("Python");
				langs.add(1, "C#");
				langs.add(0, "Ruby");

				for (String lang : langs) {

					System.out.printf("%s ", lang);
				}

				System.out.println();
			}
		}




