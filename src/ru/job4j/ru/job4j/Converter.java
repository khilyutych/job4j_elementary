package ru.job4j.ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value/87;
        return rsl;
    }
    public static float rubleToDollar(Float value) {
        float rls = value/60F;
        return rls;
    }
    public static void main (String[] args) {
        float euro = Converter.rubleToEuro(200.56F);
        float dollar = Converter.rubleToDollar(200F);
        System.out.println("200.56 rub are " + euro + " euro" );
        System.out.println("200 rub are " + dollar + " dollar");
        float in = 200;
        float expected = 4;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("200 rubles are 4. Test result : " + passed);
    }

}
