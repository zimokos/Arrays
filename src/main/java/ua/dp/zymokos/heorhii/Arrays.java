package ua.dp.zymokos.heorhii;

public class Arrays {
    public static void main(String[] args) {

        int[] array = generateArray();
        System.out.print("Массив случайных чисел: ");
        printArray(array);

        int arrayMin = findArrayMin(array);
        int countArrayMin = countArrayMin(array, arrayMin);
        int arrayMax = findArrayMax(array);
        int countArrayMax = countArrayMax(array, arrayMax);
        System.out.println("Минимальный элемент: " + arrayMin + " (количество: " + countArrayMin + ")");
        System.out.println("Максимальный элемент: " + arrayMax + " (количество: " + countArrayMax + ")");

        primeNumbers(array);

        System.out.print("Массив в обратном порядке: ");
        printArray(reverseArray(array));
        System.out.println();
    }

    public static int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random());
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int findArrayMin(int[] array) {
        int arrayMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < arrayMin) {
                arrayMin = array[i];
            }
        }
        System.out.println();
        return arrayMin;
    }

    public static int countArrayMin(int[] array, int arrayMin) {
        int countArrayMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (arrayMin == array[i]) {
                countArrayMin++;
            }
        }
        return countArrayMin;
    }

    public static int findArrayMax(int[] array) {
        int arrayMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > arrayMax) {
                arrayMax = array[i];
            }
        }
        return arrayMax;
    }

    public static int countArrayMax(int[] array, int arrayMax) {
        int countArrayMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (arrayMax == array[i]) {
                countArrayMax++;
            }
        }
        return countArrayMax;
    }

    public static void primeNumbers(int[] array) {
        System.out.print("Простые числа: ");
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) {
                    count++;
                }
            }
            if (count <= 2 && array[i] != 0 && array[i] != 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[reverseArray.length - 1 - i] = array[i];
        }
        return reverseArray;
    }
}
