package org.example.basicTasks;

//Write a program to swap 2 String without a temporary variable?
public class Task1 {
    public static void main(String[] args) {

        String a = "Pizza";
        String b = "Pineapple";

        System.out.println("Before Swap a = " + a + ", b = " + b );

        a = a+b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After swap: a= " + a + ", b = " +b);
    }
}
