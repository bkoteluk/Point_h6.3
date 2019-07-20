package pl.homework.app;

import pl.homework.lib.Point;
import pl.homework.util.PointTools;

public class PointTest {
    public static void main(String[] args) {
        PointTools pTools = new PointTools();
        Point point = pTools.setPoint();
        System.out.println("Punkt " + point.toString() + " leży w "
                + point.calculateQuater(true) + " układu współrzędnych" );
    }
}
