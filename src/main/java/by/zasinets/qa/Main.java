package by.zasinets.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int numberFirst = scanner.nextInt();
        int numberSecond = scanner.nextInt();

        Sum sum = new Sum(numberFirst, numberSecond);
        Multiplying multiplying = new Multiplying(numberFirst, numberSecond);

        System.out.println("Сумма двух чисел" + " " + sum.calculation());
        System.out.println("Произведение двух чисел" + " " + multiplying.calculation());
        } catch (Exception e) {
            System.out.println( "\u001B[36m"+ "Некорректно введено значение для математических операций! Попробуйте еще раз!");
        }
    }
}
