package com.company;

import java.util.Random;

public class Main {

    static double davidPower(double number, double power) {
        double iteration = 1;
        double temprary = number;
        if (power == 0) return 1;
        while (iteration != power) {
            number *= temprary;
            power--;
        }
        return number;
    }

    static int[][] matrix(int rows, int columns) {
        int matrixTemprary[][] = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixTemprary[i][j] = (int) random.nextInt(((100 - 1) + 1) + 1);
            }
        }
        return matrixTemprary;
    }

    static void DavPrint(int matrix[][], int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    static double factorial(double numbers) {
        double iteration = numbers;
        if (numbers == 0) return 1;
        while (true) {
            iteration--;
            numbers *= iteration;
            if (iteration == 1) return numbers;
        }
        // return numbers;
    }

    static void maxSumColum(int[][] feald, int rows, int columns) {
        int result[] = new int[rows];
        int summary = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                summary += feald[j][i];
            }
            result[i] = summary;
            summary = 0;
        }
        for (int i = 0; i < rows; i++) {
            System.out.printf(result[i] + " ");
        }
    }

}
