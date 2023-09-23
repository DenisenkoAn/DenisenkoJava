/**
 * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 *
 */
public class Task3 {

    public static void main(String[] args){

        int [] a = {5, 98, 9, -72, 37, -12};

        for(int i=0; i<a.length; i++){

            if (a[i]%3==0){

                System.out.println(a[i]);
            }
        }
    }
}