package com.company.task1.service;

import java.util.Scanner;

public class ConsoleHelper {
    public static void print(String line) {
        System.out.println(line);
    }

    public static int readInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void print(char [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
