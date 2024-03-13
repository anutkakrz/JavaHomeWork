package org.example.home_work1103;

import java.util.Scanner;

public class Pryamoug {
    public static void main(String[] args) {
        int weight;
        int height;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("введите ширину прямоугольника в диапозоне от 2 до 10");
            weight = scanner.nextInt();
        } while (weight <= 2 || weight >= 10);
        do {
            System.out.println("введите высоту прямоугольника в диапозоне от 2 до 10");
            height = scanner.nextInt();
        } while (height <= 2 || height >= 10);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("-----------------------");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if (i==0||i==height-1||j==0||j==weight-1){
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            System.out.println();

        }


    }
}
