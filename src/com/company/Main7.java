package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentHigh = 0;
        double sumHigh = 0;
        int countStudents = 5;
        int i = 0;

        while (i < countStudents) {
            System.out.print("введите рост " + (i+1) + " ученика: ");
            currentHigh = scanner.nextDouble();

            sumHigh += currentHigh;

            i++;
        }

        System.out.println("кол-во учеников = " + countStudents + " средний рост  = " + sumHigh / countStudents);

    }
}
