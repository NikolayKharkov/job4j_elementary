package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int ivanGrow = ivan;
        int nikGrow = nik;
        while (ivanGrow <= nikGrow) {
            ivanGrow *= 3;
            nikGrow *= 2;
            month++;
        }
        return month;
    }
}