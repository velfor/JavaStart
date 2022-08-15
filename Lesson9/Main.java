package Lesson9;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by velfor on 25.05.2022.
 */
public class Main {
    public static void main(String[] args) {
        // Дан массив 12 элементов. Найти количество четных.
        final int size = 12;
        int[] arr = new int[size];
        for(int i=0; i < size; i++){
            arr[i] = (int)(Math.random()*11);
        }
        for(int i=0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        int k = 0;
        for(int i=0; i < size; i++){
            if (arr[i] % 2 == 0){
                k++;
            }
        }
        System.out.println("Кол-во четных " + k);
    }
}
