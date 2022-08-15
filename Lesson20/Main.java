package Lesson20;

import java.util.Random;

/**
 * Created by velfor on 06.07.2022.
 */
public class Main {

    static void fillRandom(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
        }
    }
    static void fillRandom(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
        }
    }
    static void printArray(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    static void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    static void printEven(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]%2 == 0) {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();
    }
    static double sumOfArray(double[] mas) {
        double sum = 0.0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum;
    }
    static double mulOfArray(double[] mas){
        double mul = 1.0;
        for (int i = 0; i < mas.length; i++) {
            mul *= mas[i];
        }
        return mul;
    }
    static double arifmAvg(double[] mas){
        return sumOfArray(mas)/mas.length;
    }


    public static void main(String[] args) {
        double[] arr = new double[10];
        fillRandom(arr);
        printArray(arr);
        //Series1. Даны десять вещественных чисел. Найти их сумму.
        //System.out.println("Сумма элементов массива " + sumOfArray(arr));
        //Series2. Даны десять вещественных чисел. Найти их произведение.
        //System.out.println("Произведение элементов массива " + mulOfArray(arr));
        //Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.
        //System.out.println("Среднее арифметическое элементов массива " + arifmAvg(arr));
        //Series8. Дано целое число N и набор из N целых чисел. Вывести в том же
        //порядке все четные числа из данного набора и количество K таких чисел.
        //Series10. Дано целое число N и набор из N целых чисел. Если в наборе
        //имеются положительные числа, то вывести TRUE; в противном случае
        //вывести FALSE.
    }
}
