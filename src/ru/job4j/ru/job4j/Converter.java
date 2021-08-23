package ru.job4j.ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value/87;
        return rsl;
    }
    public static float rubleToDollar(Float value) {
        float rls = value/74.24F;
        return rls;
    }
    public static void main (String[] args) {
        float euro = Converter.rubleToEuro(200.56F);
        float dollar = Converter.rubleToDollar(200F);
        System.out.println("200.56 Euro are " + euro + " rub" );
        System.out.println("200 Dollar are " + dollar + " rub");
    }

}
