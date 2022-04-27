package com.company;

public class Main2 {
    public static void main(String[] args) {
        double money = 1000;
        double percent = 7;
        int currentYear = 0;
        double maxMoney = 1605;

        do {
            money = money + money * percent / 100.0;
            currentYear++;

            System.out.println(currentYear + "   " + money);
        } while (money < maxMoney);

        System.out.println(currentYear + "   " + money);
    }
}
