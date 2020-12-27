package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 7 */
public class Factorization {
    public static String recursion(int n, int p) {

        if (p > n / 2) {
            System.out.println(n);
            return "";
        }

        if (n % p == 0) {
            System.out.println(p);
            recursion(n / p, p);
        }
        else {
            recursion(n, ++p);
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int n = inn.nextInt();
        System.out.println(recursion(n, 2));
    }
}
