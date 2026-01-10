package org.example.basicTasks;

import java.util.ArrayList;

/*How can you remove all duplicates from ArrayList?
 */
public class Task10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Selenium");
        list.add("TestNG");
        list.add("Cucumber");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");

        ArrayList<String> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            String itTool = list.get(i);

            boolean found = false;

            for(int j = 0; j < newList.size(); j++){
                if(newList.get(j).equals(itTool)){
                    found = true;
                    break;
                }
            }
            if(!found){
                newList.add(itTool);
            }
        }
        System.out.println(newList);

    }

}
