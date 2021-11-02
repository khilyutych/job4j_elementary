package ru.job4j.array;

import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Petr";
        System.out.println(names [0]);
        names[1] = "Sergey";
        System.out.println(names [1]);
        names[2] = "Kostya";
        System.out.println(names [2]);
        names[3] = "Oleg";
        System.out.println(names [3]);
    }
}
