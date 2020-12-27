package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 14*/
public class DigitsLeftToRight {
    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion(n));
    }
}
