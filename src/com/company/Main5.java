package com.company;

public class Main5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("hello world " + i);
        }

        for (int i = 10; i > 0; i--) {
            if (i == 7) {
                break;
            }
            System.out.println("world hello " + i);
        }

        for(;;){
            System.out.println(" world ");
        }
    }
}
