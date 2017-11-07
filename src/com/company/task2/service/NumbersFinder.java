package com.company.task2.service;

public class NumbersFinder {

    public NumbersFinder() {
    }

    public int[] findNumbers(int to) {
        if (to < 1) {
            throw new IllegalArgumentException("Number should be > 1");
        }

        int[] result = new int[10]; // change it

        int summ;
        int index = 0;

        for (int i = 1; i <= to; i++) {
            summ = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    summ = summ + j;
                }
            }
            if (i == summ) {
                result[index++] = i;
            }
        }
        return normalizeArray(result);
    }

    private int[] normalizeArray(int[] array) {
        int[] result = new int[lenghtOf(array)];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;
    }

    private int lenghtOf(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }


}
