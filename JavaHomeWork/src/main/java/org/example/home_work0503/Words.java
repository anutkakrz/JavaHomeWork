package org.example.home_work0503;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        //    Введите 2 слова, воспользуйтесь сканером, состоящие из четного
//    количества букв (проверьте количество букв в слове).
//    Нужно получить слово, состоящее из первой половины первого слова
//    и второй половины второго слова. распечатать на консоль.
//            Например: ввод - mama, papa вывод - mapa
//
        Scanner scanner = new Scanner(System.in);
        String word1;
        String word2;
        String word1Even;

        System.out.println("введите слово 1 состоящее из четного колличесва букв");
        word1 = scanner.next();
        if (word1.length()%2==0) {
           word1Even = word1;
        } else {System.out.println("во введенном слове 1 нечетное колличество букв, введите другое " +
                "слово 1 с четным колличесвом букв");
        word1 = scanner.next();
        }

        System.out.println("введите слово 2 состоящее из четного колличесва букв");
        word2 = scanner.next();
        if (word2.length()%2==0) {
        } else {System.out.println("во введенном слове 2 нечетное колличество букв, введите другое " +
                "слово 2 с четным колличесвом букв");
        word2 = scanner.next();
       }





    }

}




