package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && bc + ab > ac;
    }
    public static void main(String[] args) {
        System.out.println(exist(1, 1, 2));
        System.out.println(exist(2, 2, 2));
    }
}
