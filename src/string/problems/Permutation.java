package string.problems;


public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */


            String str = "ABC";
            int n = str.length();
            Permutation permutation = new Permutation();
            permutation.permute(str, 0, n - 1);
        }



    private void permute(String str, int i, int i1) {
    }
}
