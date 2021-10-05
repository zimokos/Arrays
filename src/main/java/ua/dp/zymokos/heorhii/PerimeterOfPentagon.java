package ua.dp.zymokos.heorhii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimeterOfPentagon {
    public static void main(String[] args) throws IOException {
        int[] array = inputArray();
        System.out.println("Периметр пятиугольника: " + perimeterOfPentagon(array));
    }

    public static int[] inputArray() throws IOException {
        int[] array = new int[5];
        System.out.println("Введите длины сторон пятиугольника:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String line = reader.readLine();
            int side = Integer.parseInt(line);
            array[i] = side;
        }
        return array;
    }

    public static int perimeterOfPentagon(int[] array) {
        int perimeter = 0;
        for (int i = 0; i < array.length; i++) {
            perimeter = perimeter + array[i];
        }
        return perimeter;
    }
}
