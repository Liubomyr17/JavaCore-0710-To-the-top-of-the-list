package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0710 To the top of the list
1. Create a list of strings in the main method.
2. Add 10 lines from the keyboard to it, but only add not to the end of the list, but to the beginning.
3. Using a loop, display the contents of the screen, each value from a new line.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. The program should read 10 lines from the keyboard and add them to the list.
3. The program should add lines to the top of the list.
4. The program should display a list on the screen, each value from a new line.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for(int i=0; i<10; i++) {
            strings.add(0, reader.readLine());
        }
        for(String string : strings) {
            System.out.println(string);
        }
    }
}








