package ru.job4j.condition;

public class Games {
    public static void permission(boolean allow, boolean hasMoney) {
        if (allow && hasMoney) {
            System.out.println("I can go to the game club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}