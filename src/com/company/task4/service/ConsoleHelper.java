package com.company.task4.service;

import java.util.Scanner;

public class ConsoleHelper {

    public static void printToConsole(String string) {
        System.out.println(string);
    }

    public static int readInt() {
        return new Scanner(System.in).nextInt();
    }

}
