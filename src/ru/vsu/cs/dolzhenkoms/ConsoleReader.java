package ru.vsu.cs.dolzhenkoms;

import java.util.Scanner;

public class ConsoleReader {

    public static int readNumber(String text) {
        int value = 0;
        Scanner scn = new Scanner(System.in);

        try {
            System.out.printf("Введите %s - ", text);
            value = scn.nextInt();
        }
        catch (Exception ex) {
            System.out.println("Вы не ввели число. Было установлено стандартное значение");
        }

        return value;
    }
}
