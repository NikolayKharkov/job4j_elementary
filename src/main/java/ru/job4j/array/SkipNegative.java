package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (array[i][k] < 0) {
                        array[i][k] = 0;
                    }
                }

            }

        }
        return array;
    }
}
