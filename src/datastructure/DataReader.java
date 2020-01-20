package datastructure;

import java.io.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

				InputStream istream;
				OutputStream ostream;
				int c;
				final int EOF = -1;
				ostream = System.out;
				try {
					File inputFile = new File("Data.txt");
					istream = new FileInputStream(inputFile);
					try {
						while ((c = istream.read()) != EOF)
							ostream.write(c);
					} catch (IOException e) {
						System.out.println("Error: " + e.getMessage());
					} finally {
						try {
							istream.close();
							ostream.close();
						} catch (IOException e) {
							System.out.println("File did not close");
						}
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					System.exit(1);
				}
			}

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";



	}


