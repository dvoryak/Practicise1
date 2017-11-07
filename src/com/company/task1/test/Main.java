package com.company.task1.test;

import com.company.task1.service.ConsoleHelper;
import com.company.task1.service.Converter;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter();
        ConsoleHelper.print("Enter a number ");
        int number = ConsoleHelper.readInt();
        ConsoleHelper.print("Enter a radix ");
        int radix = ConsoleHelper.readInt();
        ConsoleHelper.print(converter.convert(number,radix));
    }
}
