package com.company.task2.test;

import com.company.task2.service.ConsoleHelper;
import com.company.task2.service.NumbersFinder;

public class Main {
    public static void main(String[] args) {
        ConsoleHelper.print("Enter N");
        NumbersFinder numbersFinder = new NumbersFinder();
        int[] result = numbersFinder.findNumbers(ConsoleHelper.readInt());
        ConsoleHelper.print(result);
    }
}
