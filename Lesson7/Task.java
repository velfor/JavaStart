package Lesson7;

import java.util.Scanner;

/**
 * Created by velfor on 11.05.2022.
 */
public class Task {
    public static void main(String[] args) {
//        Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
//        недели, соответствующее данному числу (1 — «понедельник», 2 — «втор
//        ник» и т. д.).
        /*Scanner in = new Scanner(System.in);
        int dayNumber = in.nextInt();

        if (dayNumber == 1) System.out.println("понедельник");
        else if (dayNumber == 2) System.out.println("вторник");
        else if (dayNumber == 3) System.out.println("среда");
        else if (dayNumber == 4) System.out.println("четверг");
        else if (dayNumber == 5) System.out.println("пятница");
        else if (dayNumber == 6) System.out.println("суббота");
        else if (dayNumber == 7) System.out.println("воскресенье");
        else System.out.println("ошибка");
        */
        /*switch(dayNumber){
            case 1: System.out.println("понедельник"); break;
            case 2: System.out.println("вторник"); break;
            case 3: System.out.println("среда"); break;
            case 4: System.out.println("четверг"); break;
            case 5: System.out.println("пятница"); break;
            case 6: System.out.println("суббота"); break;
            case 7: System.out.println("воскресенье"); break;
            default: System.out.println("ошибка");
        }*/
//  Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь,
// 2 — февраль и т. д.). Вывести название соответствующего времени года («зима»,
//  «весна», «лето», «осень»).
        /*Scanner in = new Scanner(System.in);
        int monthNumber = in.nextInt();
        switch(monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("зима"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень"); break;
            */
            int a = 2;
            String str = a%2 == 0 ? "четное" : "нечетное";
            System.out.println(str);

    }
}
