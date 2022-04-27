package com.company;

public class Main4 {
    public static void main(String[] args) {
        int currentNumber = 0;

        while (currentNumber < 10) {
            currentNumber++;

            if (currentNumber == 6 || currentNumber == 8) {
                continue;
            }

            System.out.println("7 * " + currentNumber + " = " + 7 * currentNumber);
        }


    }
}
