package Lesson6;

import java.util.Scanner;

/**
 * Created by velfor on 07.05.2022.
 */
public class Main {
    public static void main(String[] args) {
        //For1. Даны целые числа K и N (N > 0). Вывести число K (N раз)
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        //int n = in.nextInt();
        for(double i = 0.1; i <=1.0; i += 0.1){
            System.out.print(Math.round(i*10)/10.0 + " ");
        }
    }
}
