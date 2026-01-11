package org.example.basicTasks;

/*Count the Number of Words in a String: Write a function to count the number of words
in a given string. Words are separated by spaces or punctuation. For example, the input
"Hello, world!" should return 2.
*/
public class Task7 {

    public static  int wordCounter(String text) {
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)== ' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String sentence = "Hello batch Twenty Five";
        int words = wordCounter(sentence);
        System.out.println("Number Of Words: "+ words);
    }
}
