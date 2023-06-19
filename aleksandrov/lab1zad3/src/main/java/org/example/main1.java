package org.example;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        //Расчет площади круга и длины его окружности
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        int rad = scanner.nextInt();
        double pi = 3.14;
        summ(rad, pi);
        sumn(rad, pi);
    }
    public static double summ(int rad, double pi) {
        double pl = pi * Math.pow(rad, 2);
        System.out.println("Площадь: " + pl + "см.кв");
        return pl;
    }
    public static double sumn(int rad, double pi) {
        double lp = 2*pi * rad;
        System.out.println("Длина: " + lp + "см");
        return lp;
    }


}

