package pl.homework.util;

import pl.homework.lib.Point;

import java.util.Locale;
import java.util.Scanner;

public class PointTools {

    public Point setPoint() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Point point = new Point();

        System.out.print("Podaj X ");
        point.setX(sc.nextDouble());
        sc.nextLine();
        System.out.println();
        System.out.println("Podaj Y ");
        point.setY(sc.nextDouble());
        sc.nextLine();
        sc.close();
        return point;
    }
}
