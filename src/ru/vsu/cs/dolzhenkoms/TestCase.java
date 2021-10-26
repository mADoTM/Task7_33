package ru.vsu.cs.dolzhenkoms;

public class TestCase {
    public static void test() {
        int[] array1 = new int[] {-3, 7, 3, 4,8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3};
        int[] array2 = new int[] {4, 6, 7, 13, 5, 4, 7, 13, 5};
        int[] strangeArray = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        ArrayUtils.printArray(array1);
        System.out.printf("Длина подстроки -1. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(array1, -1));
        System.out.println();

        ArrayUtils.printArray(array1);
        System.out.printf("Длина подстроки 0. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(array1, 0));
        System.out.println();

        ArrayUtils.printArray(array1);
        System.out.printf("Длина подстроки %s. Индекс - %s ", array1.length + 1,Main.getIndexOfMaximumCountSubsequence(array1, array1.length + 1));
        System.out.println();

        ArrayUtils.printArray(array1);
        System.out.printf("Длина подстроки 3. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(array1, 3));
        System.out.println();

        ArrayUtils.printArray(array1);
        System.out.printf("Длина подстроки %s. Индекс - %s ", array1.length, Main.getIndexOfMaximumCountSubsequence(array1, array1.length));
        System.out.println();

        ArrayUtils.printArray(strangeArray);
        System.out.printf("Длина подстроки 1. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(strangeArray, 1));
        System.out.println();

        ArrayUtils.printArray(strangeArray);
        System.out.printf("Длина подстроки -1. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(strangeArray, -1));
        System.out.println();

        ArrayUtils.printArray(strangeArray);
        System.out.printf("Длина подстроки -. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(strangeArray, 0));
        System.out.println();

        ArrayUtils.printArray(array2);
        System.out.printf("Длина подстроки 3. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(array2, 3));
        System.out.println();
        ArrayUtils.printArray(array2);
        System.out.printf("Длина подстроки 1. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(array2, 1));
        System.out.println();

        // Не существует такой последовательности
        ArrayUtils.printArray(array2);
        System.out.printf("Длина подстроки 4. Индекс - %s ", Main.getIndexOfMaximumCountSubsequence(array2, 4));
        System.out.println();
    }
}
