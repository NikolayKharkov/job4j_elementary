package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива 'ages' равен: " + ages.length);
        System.out.println("Размер массива 'surnames' равен: " + surnames.length);
        System.out.println("Размер массива 'prices' равен: " + prices.length);
        String[] name = new String[4];
        name[0] = "Альберт Эйнштейн";
        name[1] = "Исаак Ньютон";
        name[2] = "Михаил Васильевич Ломоносов";
        name[3] = "Мария Кюри";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
    }
}
