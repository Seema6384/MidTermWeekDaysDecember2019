package math.problems;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		{
			Scanner sc = new Scanner(System.in);

			//Taking rows value from the user

			System.out.println("How many rows you want in this pattern?");

			int rows = sc.nextInt();

			System.out.println("Here is your pattern....!!!");

			//Printing upper half of the pattern

			for (int i = 1; i <= rows; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					System.out.print(j+" ");
				}

				System.out.println();
			}

			//Printing lower half of the pattern

			for (int i = rows-1; i >= 1; i--)
			{
				for (int j = 1; j <= i; j++)
				{
					System.out.print(j+" ");
				}

				System.out.println();
			}

			//Closing the resources

			sc.close();
		}
	}


	}

