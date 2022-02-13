package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2То3Then3() {
        int left = 1;
        int right = 2;
        int up = 3;
        int result = Max.max(left, right, up);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2То3To2Then3() {
        int left = 1;
        int right = 2;
        int up = 3;
        int down = 2;
        int result = Max.max(left, right, up, down);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
}