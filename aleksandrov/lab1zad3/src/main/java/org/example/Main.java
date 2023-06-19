package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int value1 = scn.nextInt();
        System.out.print("Введите второе число ");
        int value2 = scn.nextInt();
        System.out.print("Введите третье число ");
        int value3 = scn.nextInt();
        System.out.println("Сумма чисел = "+sum(value1,value2,value3));
            }
        public static int sum(int value1, int value2,int value3){
        int all = value1 + value2 +value3;
        return all;
    }
}
