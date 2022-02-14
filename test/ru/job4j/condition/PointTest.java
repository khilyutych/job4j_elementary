package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        double expected = 3.6;
        Point a = new Point(0, 2);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        double expected = 5;
        Point a = new Point(-2, 4);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        double expected = 2.83;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3D() {
        double expected = 2;
        Point a = new Point(1, 2, 2);
        Point b = new Point(3, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3D1() {
        double expected = 5.196;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}