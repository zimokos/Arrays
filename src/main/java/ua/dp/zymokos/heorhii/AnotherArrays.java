package ua.dp.zymokos.heorhii;

import java.util.Random;

public class AnotherArrays {
    public static void main(String[] args) {

        int[] array = generateArray();
        System.out.print("Массив случайных чисел: ");
        printArray(array);

        sumOfNegativeElements(array);

        multiplicationOfEvenElements(array);

        System.out.println("Сумма между первым и последним отрицательным элементом: " +
                sumBetweenFirstLastNegativeElements(array) +
                " (между " + firstNegativeIndex(array) + " и " + lastNegativeIndex(array) + " элементом)");

        System.out.print("Сортировка пузырьком: ");
        printArray(bubbleSort(array));

        System.out.print("Перемешанные элементы массива: ");
        printArray(shuffleArray(array));

        multiplicationBetweenMinimumMaximum(array);
    }

    public static int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random() * (Math.random() > 0.5 ? 1 : -1));
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sumOfNegativeElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма отрицательных элементов: " + sum);
    }

    public static void multiplicationOfEvenElements(int[] array) {
        int multi = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                multi = multi * array[i];
            }
        }
        System.out.println("Произведение четных элементов: " + multi);
    }

    public static int sumBetweenFirstLastNegativeElements(int[] array) {
        int sum = 0;
        for (int i = firstNegativeIndex(array) + 1; i < lastNegativeIndex(array); i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int firstNegativeIndex(int[] array) {
        int firstNegativeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        return firstNegativeIndex;
    }

    public static int lastNegativeIndex(int[] array) {
        int lastNegativeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                lastNegativeIndex = i;
            }
        }
        return lastNegativeIndex;
    }

    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public static int[] shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int leftMinimumIndex(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
//        System.out.print("Левый минимум " + minimum);
        int minimumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minimum) {
                minimumIndex = i;
                break;
            }
        }
//        System.out.println(" (индекс " + minimumIndex + ")");
        return minimumIndex;
    }

    public static int rightMinimumIndex(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
//        System.out.print("Правый минимум " + minimum);
        int minimumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minimum) {
                minimumIndex = i;
            }
        }
//        System.out.println(" (индекс " + minimumIndex + ")");
        return minimumIndex;
    }

    public static int leftMaximumIndex(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
//        System.out.print("Левый максимум " + maximum);
        int maximumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maximum) {
                maximumIndex = i;
                break;
            }
        }
//        System.out.println(" (индекс " + maximumIndex + ")");
        return maximumIndex;
    }

    public static int rightMaximumIndex(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
//        System.out.print("Правый максимум " + maximum);
        int maximumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maximum) {
                maximumIndex = i;
            }
        }
//        System.out.println(" (индекс " + maximumIndex + ")");
        return maximumIndex;
    }

    public static void multiplicationBetweenMinimumMaximum(int[] array) {
        int multi = 1;
        int startRange = 0;
        int endRange = 0;
        if (leftMinimumIndex(array) < rightMaximumIndex(array)) {
            for (int i = leftMinimumIndex(array) + 1; i < rightMaximumIndex(array); i++) {
                multi = multi * array[i];
                startRange = leftMinimumIndex(array);
                endRange = rightMaximumIndex(array);
            }
        } else {
            for (int i = leftMaximumIndex(array) + 1; i < rightMinimumIndex(array); i++) {
                multi = multi * array[i];
                startRange = leftMaximumIndex(array);
                endRange = rightMinimumIndex(array);
            }
        }
        System.out.println("Произведение элементов между минимумом и максимумом: " + multi + " (между " + startRange + " и " + endRange + " элементом)");
    }
}
