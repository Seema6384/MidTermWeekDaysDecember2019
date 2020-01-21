package string.problems;

import java.util.Arrays;

public class Anagram {

//    public static boolean main(String[] args) {
//
//
//        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
//        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
//
//        String a = "CAT";
//        String b = "SEEMA";
//        boolean status=true;
//        if (a.length() != b.length()) {
//            status = false;
//        } else {
//            char[] ArrayS1 = a.toLowerCase().toCharArray();
//            char[] ArrayS2 = b.toLowerCase().toCharArray();
//            Arrays.sort(ArrayS1);
//            Arrays.sort(ArrayS2);
//            status = Arrays.equals(ArrayS1, ArrayS2);
//
//        }
//
//        System.out.println(a + " " + b + " " + status);
//
//    }
//}
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "SPACE";
        String f = "CAT";
        String g = "ACT";
        String b = "ESCAPE";
        char d[] = a.toCharArray();
        char h[] = f.toCharArray();
        char i[] = g.toCharArray();
        char e[]=  b.toCharArray();
        Arrays.sort(d);
        Arrays.sort(e);
        Arrays.sort(h);
        Arrays.sort(i);
        if (Arrays.equals(d,e))
        { System.out.println("This is Anagram");
        } else {
            System.out.println("This is not Anagram");
        }
        System.out.println();
        if (Arrays.equals(h,i)) {
            System.out.println("This is anagram");
        } else {
            System.out.println("This is not Anagram");
        }
    }
}