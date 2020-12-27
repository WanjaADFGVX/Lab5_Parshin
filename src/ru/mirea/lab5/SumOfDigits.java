package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 5 */
public class SumOfDigits {
    public static int recursion(int n) {

        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion(n));
    }

}
