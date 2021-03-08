package com.oxana;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[5][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 199) - 99);
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }

        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) max = array[i][j];
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Max array value is: " + max);
    }
}
