package Lesson13;

import java.util.Scanner;

/**
 * Created by velfor on 08.06.2022.
 */
public class Main {
    public static void main(String[] args) {
        //заполнить массив из 52 целых чисел следцющим образом:
        // 4 раза повторить - от 2 до 9 и 5 десяток

// Array20. Дан массив размера N (диапазон 5-15) и целые числа K и L (0 <= K <= L <= N-1).
// Найти сумму элементов массива с номерами от K до L включительно.
        int N = 15;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = (int)(Math.random() * 11) + 5;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int l = in.nextInt();
        int sum = 0;
        for(int i = k; i <= l; i++){
            sum += arr[i];
        }
        System.out.println("Сумма " + sum);
    }
}
