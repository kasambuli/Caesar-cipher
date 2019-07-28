package com.company;

public class Cipher {
    private String userInput;


    public Cipher(String userInput) {
        this.userInput = userInput;
    }

    public String getUserString() {
        return this.userInput;
    }

    public char[] encodeUserInput() {
        String userInputString = userInput.toString();
        char[] userInputArray = userInputString.toCharArray();

        return userInputArray;
    }
}