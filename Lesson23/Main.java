package Lesson23;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

/**
 * Created by velfor on 03.08.2022.
 */
public class Main {
    public static void main(String[] args) {
        //объявление матрицы
        /*int n = 3;//кол-во строк
        int m = 4;//кол-во столбцов
        int[][] arr = new int[n][m];
        //заполнение матрицы случайными числами и вывод на экран
        for(int i=0; i < n; i++) {//перебор строк
            for (int j = 0; j < m; j++) {//перебор столбцов
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        //Найти количество четных элементов в матрице
        /*int qty = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] % 2 == 0){
                    qty++;
                }
            }
        }
        System.out.println(qty);*/
        //Matrix17. Дана матрица размера n x m и целое число k. Найти
        //сумму и произведение элементов k-й строки данной матрицы.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите номер строки ");
        int k = in.nextInt();
        int sum = 0;
        for(int j = 0; j < m; j++){
            sum += arr[k][j];
        }
        System.out.println("Сумма " + k + "-ой строки " + sum);
        */
        //поле для игры крестики-нолики заполнено, нужно его распечатать
        /*final int size = 3;
        //char[][] field = new char[size][size];
        //инициализация массива
        char[][] field = {
                {'@','x','o'},
                {'@','@','@'},
                {'@','@','@'}
        };
        System.out.println(field.length);
        //для двумерного массива arr.length дает кол-во строк
        System.out.println(field[0].length);//кол-во столбцов
        //выводим на экран с помощью length
        for(int i=0; i < field.length; i++){
            for(int j=0; j < field[0].length; j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }*/
        //Matrix1. Даны целые положительные числа M и N.
        // Сформировать целочисленную матрицу размера M £ N, у которой все
        // элементы I-й строки имеют значение 10*I
        final int n =4;
        final int m = 3;
        int[][] arr = new int[n][m];
        //заполнение матрицы и вывод на экран
        for(int i=0; i < n; i++) {//перебор строк
            for (int j = 0; j < m; j++) {//перебор столбцов
                arr[i][j] = 10*i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
