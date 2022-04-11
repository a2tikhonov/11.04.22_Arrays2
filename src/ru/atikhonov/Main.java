package ru.atikhonov;

import java.text.DecimalFormat;

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
