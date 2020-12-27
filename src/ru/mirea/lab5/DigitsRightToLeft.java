package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 15*/
public class DigitsRightToLeft {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion(n));
    }
}
