package com.company.task3.test;

import com.company.task3.service.Pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size of piramid betwean [1-9]");
        Pyramid pyramid = new Pyramid(new Scanner(System.in).nextInt());
        pyramid.printPyramid();
    }
}
