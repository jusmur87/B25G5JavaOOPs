package org.example.basicTasks;

/*Check if a String is Palindrome: Determine whether a given string is a palindrome,
which means it reads the same forwards and backward. For example, "madam" is a
palindrome.
*/
public class Task4 {
    public static void main(String[] args) {

        String word1 = "racecar";
        String rev1 = new StringBuilder(word1).reverse().toString();

        System.out.println("Word 1: " + word1);
        System.out.println("Is it a palindrome? " + word1.equals(rev1)); // TRUE


        String word2 = "pizza";
        String rev2 = new StringBuilder(word2).reverse().toString();

        System.out.println("Word 2: " + word2);
        System.out.println("Is it a palindrome? " + word2.equals(rev2)); // FALSE
    }
}
