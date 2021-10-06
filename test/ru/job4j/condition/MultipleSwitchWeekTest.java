package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenName() {
        String name = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}
