package Lesson16;

import java.util.Scanner;

/**
 * Created by velfor on 22.06.2022.
 */
public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 101) - 50;
            System.out.print(arr[i] + " ");
        }*/
        /*
        //сортировка по возрастанию пузырьком
        //поторяем 1 проход столько раз, сколько элементов в массиве
        for (int k = 0; k < size; k++) {
            //проходим по массиву до предпоследнего элемента
            for (int i = 0; i < size - 1 - k; i++) {
                //если элементы стоят неправильно
                if (arr[i] > arr[i + 1]) {
                    //то меняем их местами
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("\nОтсортированный массив");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }*/
        //сортировка по убыванию пузырьком
        /*for (int k = 0; k < size; k++) {
            //проходим по массиву до предпоследнего элемента
            for (int i = 0; i < size - 1 - k; i++) {
                //если элементы стоят неправильно
                if (arr[i] < arr[i + 1]) {
                    //то меняем их местами
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("\nОтсортированный массив");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }*/
        //сортировка выбором максимального
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random() * 101) - 50;
            System.out.print(arr[i] + " ");
        }
        for(int k = 0; k < size; k++){
            //поиск макимального элемента СРЕДИ НЕУПОРЯДОЧЕННЫХ
            int max = arr[0];
            int index_max = 0;
            for(int i = 1; i < size - k; i++){
                if(arr[i] > max){
                    max = arr[i];
                    index_max = i;
                }
            }
            //переставляем максимальный на правую границу неупорядоченных
            int temp = arr[size - 1 - k];
            arr[size - 1 - k] = arr[index_max];
            arr[index_max] = temp;
        }
        //вывод массива на экран
        System.out.println("\nОтсортированный массив");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
