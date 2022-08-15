package Lesson19;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by velfor on 02.07.2022.
 */
public class Main {
    public static void main(String[] args) {
        /*
        //создаем пустой ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        //заполняяем случайными числами
        final int numbers_qty = 12;
        for (int i = 0; i < numbers_qty; i++) {
            int x = (int) (Math.random() * 21) - 10;
            arr.add(x);
            arr1.add(0, x);
        }
        //вывод на экран
        //System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");//arr[i] - уже не работает!
        }
        System.out.println("\n" + arr1);
        //добавление элемента в arr1 на позицию 2
        arr1.add(2, 20);
        System.out.println(arr1); // элементы раздвигаются, на пустое место вставляется 20
        //add увеличивает size на 1
        arr1.set(2, 99);
        System.out.println(arr1); // элементы НЕ раздвигаются, 20 заменили на 99,
        */
        // size не меняется
        //создаем ArrayList из массива
        /*int[] mas = new int[numbers_qty];
        for (int i = 0; i < numbers_qty; i++) {
            mas[i] = (int) (Math.random() * 21) - 10;
        }
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(mas));
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(arr2.get(i) + " ");
        }*/
        //удаление элемента из массива
        /*arr1.remove(2);
        System.out.println(arr1);//remove уменьшает size на 1
        */
        //создаем ArrayList из 52 элементов для колоды карт
        ArrayList<Integer> deck = new ArrayList<>();
        //4 масти
        for (int k =0; k <4; k++) {
            //добавление одной масти
            for (int i = 1; i <= 10; i++) {
                deck.add(i);
            }
            deck.add(10);
            deck.add(10);
            deck.add(10);
        }
        System.out.println(deck);
    }
}
