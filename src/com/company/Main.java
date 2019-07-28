package com.company;
import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

import com.company.Cipher;
public class Main {
    Console myConsole = System.console();
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter your desired string");
        String userStringInput = inputString.nextLine();
//        String  = "Lawrence Karanja";
        System.out.println("Okay, I will decode" + " " + userStringInput);
        Cipher cipher = new Cipher(userStringInput);
        char[] encoded = cipher.encodeUserInput();
        System.out.println("Okay, here is your coded message" + " " + Arrays.toString(encoded));
    }
}
