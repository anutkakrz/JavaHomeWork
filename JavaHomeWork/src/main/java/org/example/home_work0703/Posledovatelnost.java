package org.example.home_work0703;

import javax.swing.*;
import java.util.Scanner;

public interface Posledovatelnost {
    //    В три переменные a, b и c явно записаны программистом три целых попарно
//    неравных между собой числа. Создать программу, которая переставит числа
//    в переменных таким образом, чтобы при выводе на экран последовательность
//    a, b и c оказалась строго возрастающей.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 3 не одинаковых числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x, y, z;
        if (a < b && a < c && b < c) {
            System.out.println("последовательность:" + a + "," + b + ',' + c);
        } else if (b < a && b < c && a < c) {
            x = a;
            y = b;
            a = y;
            b = x;
            System.out.println("последовательность:" + a + "," + b + ',' + c);
        } else if (c < a && c < b && b < a) {
            x = c;
            y = a;
            a = x;
            c = y;
            System.out.println("последовательность:" + a + "," + b + ',' + c);
        }
        if (a < b && a < c && c < b) {
            x = c;
            y = b;
            b = x;
            c = y;
            System.out.println("последовательность:" + a + "," + b + ',' + c);
        }
        else if (c<a && c<b && a<b ) {
            x = a;
            y = b;
            z = c;
            a = c;
            b = x;
            c = y;
            System.out.println("последовательность:"+a+","+b+','+c);
        }
        else if (b<a && b<c && c<a ) {
            x = b;
            y = c;
            z = a;
            a = x;
            b = y;
            c = z;
            System.out.println("последовательность:"+a+","+b+','+c);
        }
        else  {
            System.out.println("введены не корректные значения");
        }
    }
}
