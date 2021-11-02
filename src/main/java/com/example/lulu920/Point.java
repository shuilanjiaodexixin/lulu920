package com.example.lulu920;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
    }

    private int getY() {
        return x;
    }

    private int getX() {
        return y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p.toString());
    }
}
