package math.problems;

import arrayB.length;

import java.util.Arrays;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // int[]  arrayA={1,3,4};
     //int[] arrayB={4,5,6,7,8};
    // output {1,3,4,5,6,7,8}


    private static int[] mergeArray(int[] arrayA, int[] arrayB)
    {
        int[] mergedArray = new int[arrayA.length + arrayB.length];

        int i=0, j=0, k=0;
        boolean amp;
        while (i < arrayA.length;j < arrayB.length)
        {
            if (arrayA[i] < arrayB[j])
            {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            }
            else
            {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        }

        while (i < arrayA.length)
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }

        while (j < arrayB.length)
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args)
    {
        int[] arrayA = new int[] {1,3,5};

        int[] arrayB = new int[] {4,5,6,7,8};

        int[] mergedArray = mergeArray(arrayA, arrayB);

        System.out.println("Array A : "+Arrays.toString(arrayA));

        System.out.println("Array B : "+Arrays.toString(arrayB));

        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
    }
}
