package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }
    public static double subAndDiv(double first, double second) {
        return sub(first, second) + div(first, second);
    }
    public static double sumAndMultiplyAndSubAndDiv(double first, double second) {
        return sum(first, second) + multiply(first, second) + sub(first, second) + div(first, second);
    }
    public static void main(String[] args) {
        System.out.println("Результат расчета равен1: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен2: " + subAndDiv(10, 20));
        System.out.println("Результат расчета равен3: " + sumAndMultiplyAndSubAndDiv(10, 20));
    }
}
