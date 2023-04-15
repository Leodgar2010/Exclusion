import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2 {
    public static double inputfloat() {
        Double a = null;
        while (a == null) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите число:");
                a = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число. Повторите.");
            }

        }
        return a;
    }

    public static void catchedRes(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void Task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    public static String inputstring() {
       String a = "";
       while (a.isEmpty()) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку:");
            a = in.nextLine();
            if (a.isEmpty()) {
                System.out.println("Вы ничего не ввели. Повторите.");
            }
        }
        return a;
    }

}

