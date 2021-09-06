package ru.job4j.condition;

public class SqArea {
    public static double scuare (double p, double k){
        double l = p*k;
        double h = p/(2*(k+1));
        double s = l*h;
        return s;
    }
    public static void main (String [] args) {
        double result = SqArea.scuare(6,2);
        System.out.println("P=6, k=2, s= "+result);
    }
}
