import java.util.Scanner;

public class Binar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] array = new int[11];
        int number = scanner.nextInt();
        String a = "1 2 3 4 5 6 7 8 9 10 11 12";
        string.split(" ");
        Integer.parseInt("1 2 3 4 5 6 7 8 9 10 11 12");
    }

    public static int binRec(int number, int [] array) {
        int result = number;
        for (int i = 0; i <= number; i++) {
            number = array[i];
            result = number;
        }
        return result;

    }

   public static int binRec( int [] array, int number,int first, int finish) {
       for (int i = 0; i < array.length; i++) {
           int first =  array[i];
           int finish = array.length - 1;
           int result = number;
           if (number != array[0] && number != finish) {
               System.out.println(number);
           }
           result = number;
       }

               return number;

           }
       }






//1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
//2. Бинарный поиск обязательно должен быть реккурсивным

//2. Пользователь вводит два числа - начальное и конечное число.
// Выведите на экран все числа в этом промежутке, НО решить необходимо только с использование реккурсии