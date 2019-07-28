package com.company;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    Console myConsole = System.console();
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter your desired string");
        String userStringInput = inputString.nextLine();
        System.out.println("Okay, I will decode" + " " + userStringInput);
        Cipher cipher = new Cipher(userStringInput);
        char[] encoded = cipher.makeUserInputCharacterArray();
        System.out.println("Okay, here is your character array fro the input" + " " + Arrays.toString(encoded));
        String indexOfCharacters = cipher.getAlphabet();
        System.out.println("Okay, here is encoded String" + " " + indexOfCharacters);
    }
}
