package ru.vsu.cs.dolzhenkoms;

public class Main {

    public static void main(String[] args) {
        TestCase.test();


        int arrayLength = ConsoleReader.readNumber("длину массива");
        int[] array = ArrayUtils.readIntArrayFromConsole(arrayLength);
        int size = ConsoleReader.readNumber("количество символов подстроки");


        int index = getIndexOfMaximumCountSubsequence(array, size);
        printAnswer(index);
    }

    public static int getIndexOfMaximumCountSubsequence(int[] array, int size) {
        if(size < 1 || size > array.length)
            return -1;

        int maxCount = 0; int tempSize = 0;
        int index = -1; int currCount = 0;

        for(int i = 0; i < array.length - size - 1; i++) {
            tempSize = 0; currCount = 0;
            for(int j = i + size; j < array.length; j++) {
                if(array[j] == array[i + tempSize]) {
                    tempSize++;
                }
                else if(array[j] != array[i + tempSize]) {
                    tempSize = 0;
                }
                if(size == tempSize) {
                    tempSize = 0;
                    currCount++;
                }
            }
            if(currCount > maxCount) {
                maxCount = currCount;
                index = i;
            }
        }

        return index;
    }

    private static void printAnswer(int index) {
        if(index < 0) {
            System.out.println("Были введены некорректные данные");
        } else {
            System.out.printf("Индекс первого элемента первого повторения самой длинной подпоследовательности - %s", index);
        }
    }
}
