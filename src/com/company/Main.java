package com.company;

public class Main {

    public static void main(String[] args) {
        double money = 1000;
        double percent = 7;
        int currentYear = 0;
        int maxYear = 7;

        while (currentYear < maxYear) {
            money = money + money * percent / 100.0;
            currentYear++;

            System.out.println(currentYear + "   " + money);
        }

        System.out.println(money);


    }
}
