
// Урок 1. Знакомство с языком программирования Java
// +Написать программу вычисления n-ого треугольного числа
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления");

        boolean bo = iScanner.hasNextInt();
        if (bo == true) {
            int n = iScanner.nextInt();
            System.out.println("Треугольное число = " + Treugol(n));
            // System.out.println("Введено %s", n);
        } else {
            System.out.println("Введено недопустимое значение ");
        }

        iScanner.close();

    }

    public static int Treugol(int n) {
        if (n == 1) {
            return 1;
        }
        return Treugol(n - 1) + n;
    }
}