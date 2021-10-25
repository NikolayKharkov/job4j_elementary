package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result = "Исходное число не делится на 3 и не является четным.";
        if (number % 6 == 0) {
            result = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            result = "Исходное число делится на 3, но не является четным.";
        } else if (number % 2 == 0) {
            result = "Исходное число не делится на 3, но является четным.";
        }
        return result;
    }
}