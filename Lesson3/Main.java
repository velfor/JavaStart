package Lesson3;

/**
 * Created by velfor on 30.04.2022.
 */
public class Main {
    public static void main(String[] args) {
        //Boolean4. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A > 2 и B <= 3»
        /*int a = 5;
        int b = 2;
        boolean res;
        res = a > 2 && b <= 3;// true && true = true, в других случаях false
        System.out.println(res);*/
        //Boolean 5
        /*int a = -5;
        int b = -3;
        boolean res;
        res = a >= 0 || b < -2;// false || false = false в других случаях true
        System.out.println(res);*/

        //If1. Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; в противном случае не изменять его. Вывести полученное число

        int a = 5;
        if ( a > 0) {
            a = a + 1;
        }
        //else{}
        System.out.println(a);
    }
}
