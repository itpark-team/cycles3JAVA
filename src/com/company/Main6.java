package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentHigh = 0;
        double sumHigh = 0;
        int countStudents = 0;

        do {
            System.out.print("введите рост текущего ученика(-1 для окончания ввода): ");
            currentHigh = scanner.nextDouble();

            if (currentHigh != -1) {
                sumHigh += currentHigh;
                countStudents++;
            }
        } while (currentHigh != -1);

        System.out.println("кол-во учеников = " + countStudents + " средний рост  = " + sumHigh / countStudents);

    }
}
