package org.example.basicTasks;

/*You have a list of strings and you want to keep only those that start with “A” and you
want to return them in lower case".
*/
public class Task8 {

    public static void main(String[] args) {

        String [] words = {"Avocado", "Banana", "Apple", "Strawberry", "Pear"};

        for(int i = 0; i < words.length; i++){
            String w = words[i];

            if(w.charAt(0) == 'A'){
                System.out.println(w.toLowerCase());
            }
        }

    }

}
