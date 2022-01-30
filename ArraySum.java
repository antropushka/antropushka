package com.company;

public class ArraySum {

    public static void main(String[] args) {

        int [] array = {6, 8, 21, 18, 7, 5, 17, 2};
        int n = 21;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] == n) {
                continue;
            }
            sum += array[i];
        }
        System.out.println(sum);
    }
}
