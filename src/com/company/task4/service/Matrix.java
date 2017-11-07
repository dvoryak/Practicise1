package com.company.task4.service;

public class Matrix {
    private int size;
    private int[][] matrix;

    public Matrix(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    public int getSize() {
        return size;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
