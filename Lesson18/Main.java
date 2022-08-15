package Lesson18;

import java.util.Scanner;

/**
 * Created by velfor on 29.06.2022.
 */
public class Main {
    public static double ringS(double r1, double r2) {
        return Math.PI * (r1 * r1 - r2 * r2);
    }

    public static void main(String[] args) {
//        Proc19. Описать функцию RingS(R1, R2) вещественного типа, находящую площадь кольца,
//        заключенного между двумя окружностями с общим центром
//        и радиусами R1 и R2 (R1 и R2 — вещественные, R1 > R2). С ее помощью
//        найти площади трех колец, для которых даны внешние и внутренние радиусы.
//        Воспользоваться формулой площади круга радиуса R: S = …¢R2. В
//        качестве значения … использовать 3.14.
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            double r1 = in.nextDouble();
            double r2 = in.nextDouble();
            System.out.println("Площадь кольца " + ringS(r1, r2));
        }
    }
}
