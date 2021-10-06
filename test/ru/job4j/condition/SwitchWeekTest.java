package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void whenDay10() {
        int day = 10;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Mistake";
        Assert.assertEquals(expected, result);
    }
}