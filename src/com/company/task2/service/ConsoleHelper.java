package com.company.task2.service;

import java.util.Scanner;

public class ConsoleHelper {
    public static void print(String number) {
        System.out.println(number);
    }

    public static int readInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void print(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
