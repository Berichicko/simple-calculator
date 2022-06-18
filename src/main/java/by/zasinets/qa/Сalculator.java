package by.zasinets.qa;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (scanner.hasNextLine()) {
            int sum = (a + b);
            int multiplication = (a * b);
            System.out.println("Сумма двух чисел" + " " + sum);
            System.out.println("Произведение двух чисел" + " " + multiplication);

        }
        scanner.close();

    }

}
