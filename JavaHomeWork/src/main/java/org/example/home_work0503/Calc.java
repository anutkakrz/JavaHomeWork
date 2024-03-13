package org.example.home_work0503;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
//        Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как отдельный метод.
        System.out.println(getSumm());
        System.out.println(getSubtraction());
        System.out.println(getMultiplication());
        System.out.println(getDivision());

    }
    public static int getSumm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int summ = num1+num2;
        return summ;
    }
    public static int getSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int subt = num1-num2;
        return subt;
    }
    public static int getMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int mult = num1*num2;
        return mult;
    }
    public static int getDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int diviz = 0;
        if (num2 == 0) {
            System.out.println("на ноль делить нельзя");
        } else {
            diviz = num1 / num2;
        }
        return diviz;


    }

}
