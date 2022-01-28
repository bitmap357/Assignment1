package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the word to be tested:");
        String testWord = sc.nextLine();
        String reverseWord = "";
        int length = testWord.length();
        for(int a = length - 1; a >= 0; a--){
            reverseWord = reverseWord + testWord.charAt(a);
        }
        if (testWord.equalsIgnoreCase(reverseWord)){
            System.out.println("The entered word is a palindrome");
        }
        else {
            System.out.println("The entered word is not a palindrome");
        }

    }
}
