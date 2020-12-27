package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 2 */
public class From1toN {
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(recursion(i));
    }
}
