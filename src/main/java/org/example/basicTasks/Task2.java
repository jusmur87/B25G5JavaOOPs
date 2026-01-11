package org.example.basicTasks;

//Find out how many alpha characters are present in a string?
public class Task2 {
    public static void main(String[] args) {
        String input = "OMG!!! The concert was 10/10!! Best night EVEEEERRR! ";
        int count = 0;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (Character.isLetter(ch)) {
                count++;
            }
        }

        System.out.println("The chaotic text: " + input);
        System.out.println("Actual alpha characters: " + count);
    }
}
