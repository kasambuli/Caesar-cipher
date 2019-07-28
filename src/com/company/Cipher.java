package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cipher {
    private String userInput;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    List<Integer> indexOfInputString = new ArrayList<Integer>();

    public Cipher(String userInput) {
        this.userInput = userInput;
    }

    public String getUserString() {
        return this.userInput;
    }

    //getter method to transform the user inout to a character Array
    public char[] makeUserInputCharacterArray() {
        String userInputString = userInput.toString();
        char[] userInputArray = userInputString.toCharArray();

        return userInputArray;

    }

    //getter method to return the indexes of the characters in the character array with the ones in the alphabet array
    public List<Integer> getAlphabet() {
        String userInputString = userInput.toString();
        char[] userInputArray = userInputString.toCharArray();

        for (char output : userInputArray) {
            int indexOfCharacter = new String(alphabet).indexOf(output);
            for (int i = 0; i < alphabet.length; ++i) {
                if (alphabet[i] == output) {
                    indexOfCharacter = i;
                    indexOfInputString.add(indexOfCharacter);
                }
            }

        }
        return indexOfInputString;
       }
}