package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divedeAndDifference(double first, double second) {
        return divede(first, second) + difference(first, second);
    }

    public static double sumAllMethods(double first, double second) {
        return divede(first, second) + difference(first, second) + sum(first, second) + multiply(first, second);
    }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат divedeAndDifference: " + divedeAndDifference(10, 20));
        System.out.println("Результат sumAllMethods: " + sumAllMethods(10, 20));

    }
}