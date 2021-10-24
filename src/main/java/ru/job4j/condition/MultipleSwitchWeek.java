package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println("RUS: " + numberOfDay("Понедельник") + " ENG: " + numberOfDay("Monday"));
        System.out.println("RUS: " + numberOfDay("Вторник") + " ENG: " + numberOfDay("Tuesday"));
        System.out.println("RUS: " + numberOfDay("Среда") + " ENG: " + numberOfDay("Wednesday"));
        System.out.println("RUS: " + numberOfDay("Четверг") + " ENG: " + numberOfDay("Thursday"));
        System.out.println("RUS: " + numberOfDay("Пятница") + " ENG: " + numberOfDay("Friday"));
        System.out.println("RUS: " + numberOfDay("Суббота") + " ENG: " + numberOfDay("Saturday"));
        System.out.println("RUS: " + numberOfDay("Воскресенье") + " ENG: " + numberOfDay("Sunday"));
        System.out.println("RUS: " + numberOfDay("fdsdfs") + " ENG: " + numberOfDay("sdfsfd"));
    }
}