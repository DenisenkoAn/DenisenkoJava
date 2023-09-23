import java.util.Scanner;

/**
 * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
 */

public class Task2 {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя:");

        String a = in.nextLine();

        in.close();

        if (a.equals("Вячеслав")){

            System.out.println("Привет, Вячеслав");
        }

        else{

            System.out.println("Нет такого имени");
        }
    }

}