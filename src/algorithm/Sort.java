package algorithm;

public class Sort<list, l> {

    long executionTime = 0;
    private Object list;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int i, j, temp;
        for (i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
        boolean swapped = true;
        int j = 0;
        int temp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }


        return list;
    }


    public Object mergeSort(int[] array) {
        //implement here
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

        return list;
    }



    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        quickSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        return list;
    }
        


    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapSort(array, n, i);

        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end 
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap 
            heapSort(array, i, 0);
        }
    
    
  
        

        return list;
    }

    private void heapSort(int[] array, int i, int i1) {
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here

    }
}
        

        return list;
    }
