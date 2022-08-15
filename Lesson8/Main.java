package Lesson8;

import java.util.Scanner;

/**
 * Created by velfor on 18.05.2022.
 */
public class Main {
    public static void main(String[] args) {
        //int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        /*
        //ввод массива с клавиатуры
        for(int i=0; i < 10; i++){
            arr[i] = in.nextInt();
        }
        //вывод массива на экран
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
        */
        //Массив размера 10. Записать в массив числа от 1 до 10
        /*
        int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i+1;
        }
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
        */
        //Заполнить массив случайными числами
        final int size = 10;
        int arr[] = new int[size];
        for(int i=0; i < size; i++){
            arr[i] = (int)(Math.random()*101);
            // random дает числа от 0 до 0,999999
            //0.99999*11=10.8999999, нужно до 10, умножаем на 10+1 = 11
        }
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
