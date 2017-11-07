package com.company.task3.service;

public class Pyramid {
    private int size;
    private int[][] data;

    public Pyramid(int size) {
        if(size < 1 || size > 9 ) throw new IllegalArgumentException("  1 < size <= 9 ");
        this.size = size;
        this.data = new int[size][];
        createNewPyramid();
    }

    private void createNewPyramid() {
        int step = 1;
        for (int i = 0; i < size; i++) {
            data[i] = new int[getSizeByStep(step)];
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = getNumberByPosition(getSizeByStep(step), j);
            }
            step++;
        }
    }

    private int getSizeByStep(int step) {
        if (step == 1) return 1;
        return (2 * step) - 1;
    }

    public int getSize() {
        return size;
    }

    public void printPyramid() {
        int spaceNums = size - 1;
        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < spaceNums; k++)
                System.out.print(" ");

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
            }

            spaceNums--;
            System.out.println();
        }
    }

    private int getNumberByPosition(int step, int pos) {
        int[] array = new int[step];
        int k = 0;
        int k1 = step / 2 + 1;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = ++k;
            } else if (i > array.length / 2) {
                array[i] = --k1;
            } else {
                array[i] = (k + k1) / 2 + 1;
            }
        }
        return array[pos];
    }


}
