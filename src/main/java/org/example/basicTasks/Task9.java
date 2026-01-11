package org.example.basicTasks;

/*Find the First Non-Repeating Character in a String: Given a string, find and return the
first non-repeating character. For example, in the string "abracadabra", the first
non-repeating character is 'c'.
*/
public class Task9 {
    public static void main(String[] args) {

        String text = "abracadabra";
        char answer = ' ';

        for(int i = 0; i <text.length(); i++){
            char current = text.charAt(i);
            int count = 0;

            for( int j = 0; j < text.length(); j++){
                if(text.charAt(j) == current){
                    count++;
                }
            }
            if(count == 1){
                answer = current;
                break;
            }
        }
        System.out.println("First Non-repeating Character: " + answer);

    }
}
