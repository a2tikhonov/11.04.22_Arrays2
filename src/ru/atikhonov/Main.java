package ru.atikhonov;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    //Задание 1
        int sumOfExpenses = 0;
            for (int i : arr) {
                sumOfExpenses += i;
            }
        System.out.println("Сумма трат за месяц составила "
                + new DecimalFormat("###,###").format(sumOfExpenses) + " рублей.");
    //Задание 2
        int maxSumOfExpenses = arr[0];
        int minSumOfExpenses = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (maxSumOfExpenses < arr[i]) maxSumOfExpenses = arr[i];
                if (minSumOfExpenses > arr[i]) minSumOfExpenses = arr[i];
            }
        System.out.println("Минимальная сумма трат за день составила "
                + new DecimalFormat("###,###").format(minSumOfExpenses) +
                " рублей. Максимальная сумма трат за день составила " +
                new DecimalFormat("###,###").format(maxSumOfExpenses) + " рублей.");
    //Задание 3
        System.out.println("Средняя сумма трат за месяц составила " +
                new DecimalFormat("###,###.##").format((float)sumOfExpenses/arr.length) +
                " рублей.");
    //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    //Задание 5
        int fillNumber = 1;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, x = matrix[i].length - 1; j < matrix[i].length; j++, x--) {
                if (i == j || i == x) matrix[i][j] = 1;
                else matrix[i][j] = 0;
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    //Задание 6
        int[] arrWithError = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arrWithError));
        int[] rightArr = new int[arrWithError.length];
        for (int i = 0, j = arrWithError.length - 1; i < arrWithError.length; i++, j--) {
            rightArr[j] = arrWithError[i];
        }
        System.out.println(Arrays.toString(rightArr));
        //Задание 7
        int temp;
        for (int i = 0; i < arrWithError.length / 2; i++) {
            temp = arrWithError[i];
            arrWithError[i] = arrWithError[arrWithError.length - 1 - i];
            arrWithError[arrWithError.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arrWithError));
        //Задание 8
        int[] anotherArray = {-6, 2, 5, -8, 8, 10, 4, -7, 10, 1};
        boolean sumOfNumbersEquals2 = false;
        for (int i = 0; i < anotherArray.length; i++) {
            for (int j = i + 1; j < anotherArray.length; j++) {
                if (anotherArray[i] + anotherArray[j] == -2) {
                    sumOfNumbersEquals2 = true;
                    System.out.println(anotherArray[i] + " и " + anotherArray[j]);
                }
            }
            if (sumOfNumbersEquals2) break;
        }
        //Задание 9
        for (int i = 0; i < anotherArray.length; i++) {
            for (int j = i + 1; j < anotherArray.length; j++) {
                if (anotherArray[i] + anotherArray[j] == -2) {
                    System.out.println(anotherArray[i] + " и " + anotherArray[j]);
                }
            }
        }

    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
