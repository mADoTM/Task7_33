package ru.vsu.cs.dolzhenkoms;

public class ArrayUtils {
    public static int[] readIntArrayFromConsole(int arraySize) {
        int[] array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = ConsoleReader.readNumber(String.format("%s элемент массива", i));
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
