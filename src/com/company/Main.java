package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Из метров в футы");
        System.out.println("2.Из футов в метры");
        int choice = in.nextInt();
        double m = 0;
        double ft = 0;
        switch (choice) {
            case 1:
                System.out.println("Введите метры:");
                m = in.nextDouble();
                System.out.println(m*3.28);
                break;
            case 2:
                System.out.println("Введите футы");
                ft = in.nextDouble();
                System.out.println(ft/3.28);
                break;
            default:
                break;
        }
    }
}