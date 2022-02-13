package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }
    public static int max(int left, int right, int up) {
        return up >= max(left, right)? up : max(left, right);
    }

    public static int max(int left, int right, int up, int down) {
        return down >= max(left, right, up)? down : max(left, right, up);
    }
}

