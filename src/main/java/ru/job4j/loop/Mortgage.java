package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double amountBalance = amount;
        while (amountBalance >= 0) {
            amountBalance = amountBalance + (amountBalance * (percent / 100));
            amountBalance -= salary;
            year++;
        }
        return year;
    }
}
