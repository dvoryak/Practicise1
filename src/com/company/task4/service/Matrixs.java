package com.company.task4.service;

public class Matrixs {

    public static void printToConsole(Matrix matrix) {
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                System.out.print(matrix.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Matrix createRandomMatrix(int size) {
        Matrix matrix = new Matrix(size);
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                matrix.getMatrix()[i][j] = (int) (Math.random() * 9);
            }
        }
        return matrix;
    }

    public static Matrix createMatrix(int size, int from) {
        Matrix matrix = new Matrix(size);
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                matrix.getMatrix()[i][j] = from++;
            }
        }
        return matrix;
    }

    public static void rotateTo90(Matrix matrix) {
        int [][] tempMatrix = new int[matrix.getSize()][matrix.getSize()];

        for(int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                tempMatrix[i][j] = matrix.getMatrix()[i][j];
            }
        }

        int index = matrix.getSize() - 1;

        for(int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                matrix.getMatrix()[i][j] = tempMatrix[j][index];
            }
            index--;
        }
    }



}
