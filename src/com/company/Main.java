package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Из метров в футы");
        System.out.println("2.Из метров в аршины");
        System.out.println("3.Из футов в метры");
        System.out.println("4.Из футов в аршины");
        System.out.println("5.Из аршин в футы");
        System.out.println("6.Из аршин в метры");
        System.out.println("");
        System.out.println("Вариант:");

        int choice = in.nextInt();
        double m = 0;
        double ft = 0;
        double ar = 0;
        System.out.println("");
        switch (choice) {
            case 1:
                System.out.println("Введите метры:");
                m = in.nextDouble();
                System.out.println("Футы:");
                System.out.println(m*3.28084);
                break;
            case 2:
                System.out.println("Введите метры:");
                m = in.nextDouble();
                System.out.println("Аршины:");
                System.out.println(m*1.40607424071991);
                break;
            case 3:
                System.out.println("Введите футы");
                ft = in.nextDouble();
                System.out.println("Метры:");
                System.out.println(ft*0.3048);
                break;
            case 4:
                System.out.println("Введите футы:");
                ft = in.nextDouble();
                System.out.println("Аршины:");
                System.out.println(ft*0.428571428571429);
                break;
            case 5:
                System.out.println("Введите аршины:");
                ar = in.nextDouble();
                System.out.println("Футы:");
                System.out.println(ar*2.333333333333);
                break;
            case 6:
                System.out.println("Введите аршины:");
                ar = in.nextDouble();
                System.out.println("Метры:");
                System.out.println(ar*0.7111999999999);
                break;
            default:
                break;
        }
    }
}