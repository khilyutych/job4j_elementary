package ru.job4j.condition;

public class ChessBoard{
    public static int way(int x1, int y1, int x2, int y2) {
        return (Math.abs(x2 - x1) == Math.abs(y2 - y1) && x1 >= 0 && x1 < 8 && y1 >= 0 && y1 < 8 && x2 >= 0 && x2 < 8 && y2 >= 0 && y2 < 8)? Math.abs(y2 - y1) : 0;
    }

    public static void main(String[] args) {
        System.out.println(way(0, 0, 4, 4));
    }
}

