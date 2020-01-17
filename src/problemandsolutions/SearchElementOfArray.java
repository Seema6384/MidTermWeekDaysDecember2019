package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {


            int[] arr={18,3,7,65,70,81,2,9,6,20};

            int num=seqsearch(arr,65, arr.length);
            if(num!=-1) System.out.println(" The values is found at the position of "+ num);

        }

        public static int seqsearch(int[] dataset,int target,int n){
            int found=0;
            int i;
            int num=-1;
            for(i=0;i<n && found!=1;i++)
                if(target==dataset[i]){num=i;found=1;}

            return num;
        }


    }

