package by.zasinets.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int numberFirst = scanner.nextInt();
        int numberSecond = scanner.nextInt();

        Addition addition = new Addition(numberFirst, numberSecond);
        Multiplication multiplication = new Multiplication(numberFirst, numberSecond);

        System.out.println("Сумма двух чисел" + " " + addition.calculation());

        System.out.println("Произведение двух чисел" + " " + multiplication.calculation());

    }
}
