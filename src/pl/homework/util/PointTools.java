package pl.homework.util;

import pl.homework.lib.Point;
import java.util.Scanner;

public class PointTools {

    public Point setPoint() {
        Scanner sc = new Scanner(System.in);
        Point point = new Point();

        System.out.print("Podaj X ");
        point.setX(sc.nextDouble());
        sc.nextLine();
        System.out.println();
        System.out.println("Podaj Y ");
        point.setY(sc.nextDouble());
        sc.nextLine();
        return point;
    }



    public String romanNumber(int number) {
        String rNumber;
        switch (number) {
            case 1 :
                rNumber = "I ćwiartce";
                break;
            case 2 :
                rNumber = "II ćwiartce";
                break;
            case 3 :
                rNumber = "III ćwiartce";
                break;
            case 4 :
                rNumber = "IV ćwiartce";
                break;
                default:
                    rNumber = " osi ";

        }
        return rNumber;
    }
}
