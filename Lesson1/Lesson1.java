package Lesson1;
//import java.lang.Math;
public class Lesson1 {
    public static void main(String[] args) {
        /*
        //Begin1◦. Дана сторона квадрата a. Найти его периметр P = 4·a
        int a;//для стороны квадрата
        int P; //для периметра
        a = 8;// в переменную а записать число 8
        P = 4 * a;
        System.out.println("Периметр квадрата " + P);
        */
        //Begin8. Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
        /*
        int a = 2;
        int b = 5;
        int k = 2;
        double c = (double)(a + b) / k; // int разделить на int - результат int
        System.out.println("c = " + c);
        */
        //Begin9–. Даны два неотрицательных числа a и b. Найти их среднее геометрическое,
        // то есть квадратный корень из их произведения
        /*
        double a = 4.0;
        double b = 9.0;
        double r = Math.sqrt(a * b);
        System.out.println("r = " + r);
        */

        //Begin22–. Поменять местами содержимое переменных A и B и вывести новые
        //значения A и B.
        int a = 10;
        int b = 20;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
    }
