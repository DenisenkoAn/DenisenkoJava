import java.util.Scanner;

/**
 * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */
public class Task1 {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");

        int a = in.nextInt();

        in.close();

        if (a > 7) {

            System.out.println("Привет");

        }
    }
}