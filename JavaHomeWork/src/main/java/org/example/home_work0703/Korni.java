package org.example.home_work0703;

public class Korni {

//    В три переменные a, b и c записаны три вещественных числа.
//    Создать программу, которая будет находить и выводить на экран
//    вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать,
//    что корней нет.
public static void main(String[] args) {
    double a = 1;
    double b = 9;
    double c = 14;
    double x,y, D;
    D = b*b -4*a*c;
    System.out.println(D);
    if (D>0) {
        x = (-b-Math.sqrt(D))/2*a;
        y = (-b+Math.sqrt(D))/2*a;
        System.out.println("квадратные корни: "+x+", "+y);
    } else if (D==0) {
        x=-b/2*a;
        System.out.println("квадратные корни: "+x+", "+x);
    }
    else {
        System.out.println("квадратные корней у выражения нет");
    }
}
}
