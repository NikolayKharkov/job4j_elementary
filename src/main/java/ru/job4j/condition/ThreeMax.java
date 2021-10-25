package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int rsl = first;
        if (second >= first && second >= third) {
            rsl = second;
        }
        if (third >= first && third >= second) {
            rsl = third;
        }
        return rsl;
    }
}