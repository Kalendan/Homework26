import java.util.Random;
import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();

        int[] array = new int[11];

        for (int j = 0; j < array.length; j++) {
            boolean a = false;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    a = true;
                }
            }
            if (!a) {
                break;
            }

            public static int binarMeth ( int[] array, int number, int start, int finish){
                int start = 0;
                int finish = array.length - 1;
                int middle = (start + finish) / 2;
                int index = 11;

                while (start <= finish) {
                    if (array[middle] == number) {
                        index = middle;
                    }
                    finish = middle - 1;
                    if (array[middle] > number) {
                    }

                    if (array[middle] < number) {
                        start = middle + 1;
                    }
                }
                return index;
            }
        }
    }
}











//1.Пользователь вводит 10 чисел с консоли
//Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
//Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым
//Вывести результат (индекс) на экран

//Усложнения:
//1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
//2. Бинарный поиск обязательно должен быть реккурсивным

//2. Пользователь вводит два числа - начальное и конечное число.
// Выведите на экран все числа в этом промежутке, НО решить необходимо только с использование реккурсии