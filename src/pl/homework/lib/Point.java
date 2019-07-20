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

    public String calculateQuater(boolean romanNumber) {
        String result;
        int  quater = calculateQuater();
        switch (quater) {
            case 1 :
                result = romanNumber ? "I" : "pierwszej";
                break;
            case 2 :
                result = romanNumber ? "II" : "drugiej";
                break;
            case 3 :
                result = romanNumber ? "III" : "trzeciej";
                break;
            case 4 :
                result = romanNumber ? "IV" : "czwartej";
                break;
            default:
                result = " osi ";
        }
        return result + " ćwiartce ";
    }
}
