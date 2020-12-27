package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 10 */
public class ReverseNumber {
    public static int recursion(int n, int i) {
        /* Используем тернарную операцию */
        return (n == 0) ? i : recursion(n/10, i*10 + n%10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(recursion(a, 0));
    }
}
