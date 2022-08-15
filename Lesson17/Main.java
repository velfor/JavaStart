package Lesson17;

import java.util.Scanner;

/**
 * Created by velfor on 25.06.2022.
 */
public class Main {
    /*public static double powerA3(double a) {
        return a * a * a;
    }*/
    public static double afirmMean(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
//Proc1. Описать функцию PowerA3(A), вычисляющую третью степень числа A и возвращающую ее
//С помощью этой
//функции найти третьи степени пяти данных чисел.
        Scanner in = new Scanner(System.in);
        /*for (int i = 0; i < 5; i++) {
            double x = in.nextDouble();
            double y = powerA3(x);
            System.out.println(y);
        }*/
//Написать функцию, вычисляющую среднее арифметическое двух вещественных чисел. С помощью
// этой функции вычислить для трех разных пар чисел среднее арифм
        for(int i = 0; i < 3; i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            double res = afirmMean(x, y);
            System.out.println(res);
        }
    }
}
