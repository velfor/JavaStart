package Lesson10;

import java.util.Scanner;

/**
 * Created by velfor on 28.05.2022.
 */
public class Main {
    public static void main(String[] args) {
        //Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.
        /*final int size = 10;
        double mas[] = new double[size];
        for(int i = 0; i < size; i++){
            mas[i] = Math.round(Math.random()*1000)/100.0;
            System.out.print(mas[i] + " ");
        }
        double sum = 0.0;
        for(int i = 0; i < size; i++){
            sum += mas[i];
        }
        double avg = sum / size;
        System.out.println("\nСреднее арифметическое " + avg);
        */
//        Series5. Дано целое число N и набор из N положительных вещественных
//        чисел. Вывести в том же порядке целые части всех чисел из данного
//        набора (как вещественные числа с нулевой дробной частью), а также
//        сумму всех целых частей.
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        double arr[] = new double[size];
        for(int i = 0; i < size; i++){
            arr[i] = Math.round(Math.random()*1000)/100.0;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i < size; i++){
            System.out.print(((int)arr[i])*1.0 + " ");
            //System.out.print(Math.floor(arr[i]) + " ");
            sum = sum + (int)arr[i];
        }
        System.out.println("\nСумма " + sum);*/
//        Series8. Дано целое число N и набор из N целых чисел. Вывести в том же
//        порядке все четные числа из данного набора и количество K таких чисел.
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*101);// от 0 до 100
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k = 0;
        for(int i=0; i < size; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
                k++;
            }
        }
        System.out.println("\nКол-во четных " + k);
    }
}
