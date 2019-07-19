package pl.homework.lib;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return " (" + x + ", " + y + " ) ";
    }

    public int calculateQuater() {
        int quater;
        if (x > 0 && y > 0)
            quater = 1;
        else if (x > 0 && y < 0)
            quater = 4;
        else if (x < 0 && y >0 )
            quater = 2;
        else if (x < 0 && y < 0)
            quater = 3;
        else
            quater = 0;
        return quater;
    }
}
