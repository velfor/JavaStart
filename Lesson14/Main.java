package Lesson14;

/**
 * Created by velfor on 11.06.2022.
 */
public class Main {

    public static void main(String[] args) {
        /*
    //    Array51. Даны массивы A и B одинакового размера N. Поменять местами их
    //    содержимое и вывести вначале элементы преобразованного массива A, а
    //    затем — элементы преобразованного массива B.
        int N = 6;
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0; i < N; i++){
            //диапазон 25-40
            A[i] = (int)(Math.random() * 16) + 25;
            B[i] = (int)(Math.random() * 16) + 25;
        }
        //вывод массива А
        System.out.println("Массив А");
        for(int i=0; i < N; i++){
            System.out.print(A[i] + " ");
        }
        //вывод массива В
        System.out.println("\nМассив B");
        for(int i=0; i < N; i++){
            System.out.print(B[i] + " ");
        }
        //переставляем местами
        for(int i=0; i < N; i++){
            int temp = A[i];
            A[i] = B[i];
            B[i] = temp;
        }
        //вывод массива А
        System.out.println("\nМассив А");
        for(int i=0; i < N; i++){
            System.out.print(A[i] + " ");
        }
        //вывод массива В
        System.out.println("\nМассив B");
        for(int i=0; i < N; i++){
            System.out.print(B[i] + " ");
        }
        */
        // Дан массив целых чисел А размера N. Найти в этом массиве максимальный элемент
        // и его индекс
        int N = 12;
        int[] A = new int[N];
        //диапазон от -20 до 29
        for(int i = 0; i < N; i++){
            A[i] = (int)(Math.random()*50)-20;
            System.out.print(A[i] + " ");
        }
        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        for(int i=0; i < N; i++){
            if (A[i] > max){
                max = A[i];
                indexMax = i;
            }
        }
        System.out.println("\n Максимальный " + max + " индекс " + indexMax);
    }
}
