package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int[] helper = new int[1];

        for (int i = 0; i < array.length; i++) {
            int temp = Math.abs(array[i]);
            if (temp <= array.length) {
                array[temp - 1] *= (-1);
            }

            else if (temp > array.length) {
                if (temp % array.length != 0)
                    helper[temp % array.length - 1] = -1;
                else
                    helper[(temp % array.length) +
                            array.length - 1] = -1;
            }
        }

        for (int i = 0; i < array.length; i++)
            if (array[i] > 0)
                System.out.print(i + 1 + " ");
        for (int i = 0; i < helper.length; i++)
            if (helper[i] >= 0)
                System.out.print(array.length + i + 1 + " ");

        return;
    }

    {
        int[] array = { 10, 2, 1, 4, 5, 3, 7, 8, 6};

        missing1(array);
    }

    private void missing1(int[] array) {
    }
}



