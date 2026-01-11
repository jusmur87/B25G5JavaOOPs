package org.example.basicTasks;

import java.util.Arrays;

/*Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams,
meaning they contain the same characters in a different order. For example, "listen"
and "silent" are anagrams.
*/
public class Task5 {
    public static void main(String[] args) {
        String str1 = "School Master";
        String str2 = "The Classroom";

        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();


        if (s1.length() != s2.length()) {
            System.out.println("Result: Not Anagrams");
        } else {
            // 3. Convert to arrays and sort
            char[] array1 = s1.toCharArray();
            char[] array2 = s2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);


            if (Arrays.equals(array1, array2)) {
                System.out.println("'" + str1 + "' and '" + str2 + "' are ANAGRAMS!");

            } else {
                System.out.println("Result: Not Anagrams");
            }
        }
    }
}
