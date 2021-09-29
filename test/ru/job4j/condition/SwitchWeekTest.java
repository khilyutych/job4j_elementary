package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void nameOfDay() {
        int day = 10;
        int return = SwitchWeekTest.nameOfDay(day);
        int expected = "Mistake";
        Assert.assertEquals(expected, return);
    }
}