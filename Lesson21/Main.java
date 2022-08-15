package Lesson21;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by velfor on 09.07.2022.
 */
public class Main {
    /*
    static void fillRandom(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 21);
        }
    }
    static void fillRandom(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20) + 1;
        }
    }
    static void printArray(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    static void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    //Array18. Дан массив A ненулевых целых чисел размера 10. Вывести значение
    //первого из тех его элементов A[K], которые удовлетворяют неравенству
    //A[K] < A[10]. Если таких элементов нет, то вывести 0.
    static int find(int[] mas){
        int res = 0;
        for(int i = 0; i < mas.length; i++){
            if(mas[i] < mas[mas.length - 1]){
                res = mas[i];
                break;
            }
        }
        return res;
    }*/
    //заполнение колоды картами
    static void initDeck(ArrayList<Integer> deck) {
        //повторяем 4 раза, для каждой масти
        for(Integer k = 0; k < 4; k++) {
            //одна масть
            //заполняем от 1 до 10
            for (Integer i = 1; i <= 10; i++) {
                deck.add(i);
            }
            //заполняем Валет, Дама, Король - по 10 ( 3 раза по 10)
            for (Integer i = 0; i < 3; i++) {
                deck.add(10);
            }
        }
    }
    static void print(ArrayList<Integer> deck){
        for(int i = 0; i < deck.size(); i++){
            System.out.print(deck.get(i) + " ");
        }
        System.out.println();
    }
    static void shuffleDeck(ArrayList<Integer> deck){
        Random rand = new Random();
        for(int i = 0; i < deck.size(); i++){
            int randomIndex = rand.nextInt(deck.size()-1);
            int temp = deck.get(i);
            deck.set(i, deck.get(randomIndex));
            deck.set(randomIndex, temp);
        }
    }
    //взять одну карту из колоды
    static void takeOneCard(ArrayList<Integer> deck, ArrayList<Integer> hand){
        int card = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        hand.add(card);
    }
    //подсчитать счет на руке
    static int getScore(ArrayList<Integer> hand){
        int sum = 0;
        for(int i = 0; i < hand.size(); i++){
            sum += hand.get(i);
        }
        return sum;
    }
    //игра игрока
    static void playerGame(ArrayList<Integer> deck, ArrayList<Integer> player){
        Scanner in = new Scanner(System.in);
        int answer = 1;// 1 - играем дальше
        while(answer == 1){
            takeOneCard(deck, player);
            System.out.print("Ваша рука: ");
            print(player);
            System.out.println("У Вас " + getScore(player) + " очков");
            if (getScore(player) >= 21) break;
            System.out.println("Хотите еще карту? Введите 1 если да, иначе любая другая цифра ");
            answer = in.nextInt();
        }
    }
    //игра дилера
    static void dealerGame(ArrayList<Integer> deck, ArrayList<Integer> dealer){
        //брать карты пока счет меньше 17 очков
        while(getScore(dealer) < 17){
            takeOneCard(deck, dealer);
        }
        System.out.print("Рука дилера: ");
        print(dealer);
        System.out.println("У дилера " + getScore(dealer) + " очков");
    }
    static void analyzePlayerGame(ArrayList<Integer> player){

    }
    public static void main(String[] args) {
        /*int[] arr = new int[10];
        fillRandom(arr);
        printArray(arr);
        System.out.println("Первый меньше 10-го " + find(arr));*/
        Scanner in = new Scanner(System.in);
        char answer = 'y';
        while (answer == 'y'){
            //подготовка колоды
            ArrayList<Integer> deck = new ArrayList<>();
            initDeck(deck);
            //print(deck);
            shuffleDeck(deck);
            //print(deck);
            //ход игрока
            ArrayList<Integer> player = new ArrayList<>();
            playerGame(deck, player);
            //анализ игры игрока
            int playerScore = getScore(player);
            if (playerScore == 21) {
                System.out.println("Player won!");
            }
            else if (playerScore > 21){
                System.out.println("Player lose!");
            }
            else if (playerScore < 21) {
                //ход дилера
                ArrayList<Integer> dealer = new ArrayList<>();
                dealerGame(deck, dealer);
                //analyseDealerGame
                int dealerScore = getScore(dealer);
                if (dealerScore == 21) {
                    System.out.println("Dealer won!");
                }
                else if (dealerScore > 21) {
                    System.out.println("Dealer lose!");
                }
                //analyseFinal
                else if (dealerScore < 21) {
                    if (playerScore > dealerScore) {
                        System.out.println("Player won!");
                    } else if (dealerScore > playerScore) {
                        System.out.println("Dealer won!");
                    } else if (playerScore == dealerScore) {
                        System.out.println("Draw!");
                    }
                }
            }
            //хотите повторить
            System.out.println("Для продолжения игры нажмите Y, для завершения любую другую клавишу");
            answer = in.nextLine().charAt(0);
        }
    }
}
