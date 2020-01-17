package math.problems;

import java.util.Arrays;

import static org.openxmlformats.schemas.drawingml.x2006.chart.STCrosses.INT_MAX;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        Arrays.sort(array1);
        Arrays.sort(array2);
        int minDiff1 = array1[1] - array1[0];
        int minDiff2 = array2[1] - array2[0];
        for (int i = 2; i != array1.length; i++) {
            minDiff1 = Math.min(minDiff1, array1[i] - array1[i - 1]);
        }
        for (int i = 2; i != array2.length; i++) {
            minDiff2 = Math.min(minDiff2, array2[i] - array2[i - 1]);
        }

        System.out.println(minDiff1);
        System.out.println(minDiff2);
    }}