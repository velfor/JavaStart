package Lesson11;

import java.util.Scanner;

/**
 * Created by velfor on 01.06.2022.
 */
public class Main {
    public static void main(String[] args) {
//        Series9. Дано целое число N и набор из N целых чисел. Вывести в том же
//        порядке номера всех нечетных чисел из данного набора и количество K
//        таких чисел (диапазон от -7 до 15)
        /*
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = (int)(Math.random() * 23) - 7;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k = 0;
        for(int i=0; i < N; i++){
            if(arr[i] % 2 != 0){
                System.out.print(i + " ");
                k++;
            }
        }
        System.out.println("\n" + k);
        */
//        Series12. Дан набор ненулевых целых чисел; признак его завершения — число 0.
//        Вывести количество чисел в наборе.
        /*int x;// для ввода очередного числа
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        int k = 0;
        while(x != 0){//условия не завершения, а продолжения цикла
            k++;
            x = in.nextInt();
        }
        System.out.println("Кол-во чисел " + k);*/
//        Series14. Дано целое число K и набор ненулевых целых чисел; признак его
//        завершения — число 0. Вывести количество чисел в наборе, меньших K.
        /*int x;// для ввода очередного числа
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k ");
        int k = in.nextInt();//по условию
        System.out.println("Вводите числа, для окончания работы введите 0");
        x = in.nextInt();
        int q = 0;//кол-во чисел <k
        while(x != 0) {//условия не завершения, а продолжения цикла
            if(x < k){
                q++;
            }
            x = in.nextInt();//вводим новое число
        }
        System.out.println("Кол-во чисел <k " + q);*/


    }
}
