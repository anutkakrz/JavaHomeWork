package org.example.home_work0403;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Converter converter = new Converter();
        converter.convertNumber();
    }


    public void convertNumber() {
        Scanner sc = new Scanner(System.in);
        long number;
        int numberSystem;
        int numberSystemNumber;
        System.out.println("В какой системе счисления число?");
        numberSystemNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Введите число: ");
        number = Long.parseLong(sc.nextLine(), numberSystemNumber);
        System.out.println("Введите систему счисления:");
        numberSystem = sc.nextInt();
        System.out.println("Полученное число " + Long.toString(number, numberSystem));

    }
//    решение писала не я - взяла в презентации, так как я вообще не поняла условие задачи, то решила
//    написать код и провалиться в подсказки. Подсказки не оч помогли))) помог чат GPT разобраться
//            что к чему.
}

