package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height1) {
        double rls = (height1-100)*1.15;
        return rls;
    }
    public static double womanWeight(short height2) {
        double rls = (height2-110)*1.15;
        return rls;
    }
    public static void main (String[] args) {
        short height1 = 178;
        short height2 = 169;
        double man = Fit.manWeight(height1);
        double woman = Fit.womanWeight(height2);;
        System.out.println("Man 178sm - "+ man +" kg");
        System.out.println("Woman 169sm - "+ woman + " kg");
    }
}
