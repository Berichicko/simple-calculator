package by.zasinets.qa;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int numberFirst = scanner.nextInt();
        int numberSecond = scanner.nextInt();
        int resultSum = numberFirst * numberSecond;
        System.out.println("Сумма двух чисел" + " " + resultSum);
        int resultMultiply = numberFirst * numberSecond;
        System.out.println("Произведение двух чисел" + " " + resultMultiply);
    }
}
