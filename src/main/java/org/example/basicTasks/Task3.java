package org.example.basicTasks;

/*Reverse a String: Write a function to reverse a given string. For example, given the
  input "Hello", the output should be "olleH".*/
public class Task3 {
    public static void main(String[] args) {
        String word = "desserts"; // Even with a capital 'D'

        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("Reading forward: " + word);
        System.out.println("Reading backward: " + reversed);

    }
}

