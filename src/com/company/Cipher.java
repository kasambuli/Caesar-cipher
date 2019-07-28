package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cipher {
    private String userInput;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    List<Integer> indexOfInputString = new ArrayList<Integer>();
    List<Character> encodedArrayOfInput = new ArrayList<Character>();

    public Cipher(String userInput) {
        this.userInput = userInput;
    }

    //getter method to transform the user inout to a character Array
    public char[] makeUserInputCharacterArray() {
        String userInputString = userInput.toString();
        char[] userInputArray = userInputString.toCharArray();

        return userInputArray;

    }

    //getter method to encode the user input
    public String getAlphabet() {
        String userInputString = userInput.toString();
        char[] userInputArray = userInputString.toCharArray();

        for (char output : userInputArray) {
            int indexOfCharacter = new String(alphabet).indexOf(output);
            for (int i = 0; i < alphabet.length; ++i) {
                if (alphabet[i] == output) {
                    indexOfCharacter = i + 2;
                    if (indexOfCharacter > 25) {
                        indexOfCharacter = indexOfCharacter - 26;
                        indexOfInputString.add(indexOfCharacter);
                    } else {
                        indexOfInputString.add(indexOfCharacter);
                    }
                }
            }

        }
        for (int i = 0; i < indexOfInputString.size(); ++i) {
            encodedArrayOfInput.add(alphabet[indexOfInputString.get(i)]);
        }
        StringBuilder encodedString = new StringBuilder();
        for (char c : encodedArrayOfInput) {
            encodedString.append(c);
        }
        String encodedStringJoined = encodedString.toString();

        return encodedStringJoined;
    }


}