package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] digits = {-15.3, -11.2, -2.2, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        int numbercount = 0;
        double number2 = 0.0;
        boolean proverka = false;
        for (double numbers : digits) {
            if (numbers < 0) {
                proverka = true;
            } else if (numbers > 0 && proverka) {
                numbercount++;
                number2 += numbers;
                System.out.println(numbers);
            }
        }
        System.out.println("Среднее арифметическое = " + number2 / numbercount);

        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = 0; j < digits.length - i - 1; j++) {
                if (digits[j] > digits[j + 1]) {
                    double temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(digits));
        }
    }
}

