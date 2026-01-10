package org.example.basicTasks;

/*Create a method to count how many vowels are present in a string “documentation”*/
public class Task6 {

    public static int vowelsCounter(String word){
        int count = 0;
        String vowels = "aeiouAEIOU";
         for(int i = 0; i< word.length(); i++){
             char ch = word.charAt(i);
             if(vowels.indexOf(ch) != -1){
                 count++;
             }
         }
         return count;
    }

    public static void main(String[] args) {
        String text = "Extraordinary";
        int result = vowelsCounter(text);
        System.out.println("The number of vowels is: "+result);
    }

}
