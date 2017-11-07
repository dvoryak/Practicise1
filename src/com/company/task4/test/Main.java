package com.company.task4.test;

import com.company.task4.service.ConsoleHelper;
import com.company.task4.service.Matrix;
import com.company.task4.service.Matrixs;

public class Main {
    public static void main(String[] args)  {
        ConsoleHelper.printToConsole("Enter a matrix size");
        Matrix matrix = Matrixs.createRandomMatrix(ConsoleHelper.readInt());
        //Matrix matrix = Matrixs.createMatrix(3,1);
        ConsoleHelper.printToConsole("Initial matrix");
        Matrixs.printToConsole(matrix);
        ConsoleHelper.printToConsole("Rotated matrix");
        Matrixs.rotateTo90(matrix);
        Matrixs.printToConsole(matrix);
    }

}
