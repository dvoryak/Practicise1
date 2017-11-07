package com.company.task1.service;


public class Converter {

    public Converter() {}

    public char[] convert(int number, int radix) {
        return convertToRadix(number,radix);
    }

    private char[] convertToRadix(int number, int radix) {
        char [] alph;
        switch (radix) {
            case 8 : alph = new char[] {'0','1','2','3','4','5','6','7'};
                break;
            case 2 : alph = new char[] {'0','1'};
                break;
            case 16 : alph = new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                break;
            default: throw new IllegalArgumentException("radix should be 2 | 8  | 16 ");
        }

        char[] nums = new char[32];
        fillCharsArray(nums);

        int index = 0;
        while (number > 0) {
            int i = number % radix;
            number = number / radix;
            nums[index++] = alph[i];
        }

        return reverseArray(normalizeArray(nums));
    }

    private int lenghtOf(char[] array) {
       int count = 0;
       for(char c : array) {
           if(c != '*') {
               count++;
           }
       }
       return count;
    }

    private char[] normalizeArray(char[] array) {
        char[] newArray = new char[lenghtOf(array)];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    private void fillCharsArray(char[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = '*';
        }
    }

    private char[] reverseArray(char[] arrays) {
        char[] tmp = new char[arrays.length];

        for(int i = 0; i < tmp.length; i++) {
            tmp[i] = arrays[arrays.length - i - 1];
        }

        return tmp;
    }
}
