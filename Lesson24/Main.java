package Lesson24;

import java.util.Scanner;

/**
 * Created by velfor on 07.08.2022.
 */
public class Main {
    public static void initField(char[][] field){
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                field[i][j] = ' ';
            }
        }
    }
    public static void printField(char[][] field){
        for(int i=0; i < field.length; i++) {
            System.out.println("|---|---|---|");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print("| " + field[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("|---|---|---|");
    }
    public static void move(char[][] field, char symbol){
        Scanner in = new Scanner(System.in);
        int row;
        do {
            System.out.print("Введите номер строки ");
            row = in.nextInt();
        }
        while(row < 0 || row > 2);
        int col;
        do {
            System.out.print("Введите номер столбца ");
            col = in.nextInt();
        }
        while(col < 0 || col > 2);
        field[row][col] = symbol;
    }
    public static boolean endGame(char[][] field, char symbol){
        //проверка на выигрыш
            //проверка по горизонтали
            for (int i = 0; i < field.length; i++) {
                if (field[i][0] == field[i][1] && field[i][1] == field[i][2] &&
                        field[i][2] == symbol) {
                    System.out.println(symbol + " выиграли");
                    return true;
                }
            }
            //проверка по вертикали
            for (int j = 0; j < field[0].length; j++) {
                if (field[0][j] == field[1][j] && field[1][j] == field[2][j]&&
                        field[2][j] == symbol) {
                    System.out.println(symbol + " выиграли");
                    return true;
                }
            }
            //проверка главной диагонали
            if (field[0][0] == field[1][1] && field[1][1] == field[2][2]&&
                    field[2][2] == symbol) {
                System.out.println(symbol + " выиграли");
                return true;
            }
            //проверка побочной диагонали
            if (field[0][2] == field[1][1] && field[1][1] == field[2][0]&&
                    field[2][0] == symbol) {
                System.out.println(symbol + " выиграли");
                return true;
            }
        //проверка на ничью
        //ничья тогда,когда заполнены все ячейки, т.е. нет пробелов
        int spaces = 0;
        for(int i = 0; i < field.length; i++){
            for(int j= 0; j < field[i].length; j++){
                if (field[i][j] == ' ') spaces++;
            }
        }
        if(spaces == 0) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        final int size = 3;
        char[][] field = new char[size][size];
        initField(field);
        printField(field);
        while(true){
            move(field, 'x');
            printField(field);
            if(endGame(field,'x')){
               break;
            }
            else{
                move(field, 'o');
                printField(field);
                if(endGame(field,'o')){
                    break;
                }
            }
        }
        System.out.println("Игра окончена");
    }
}
