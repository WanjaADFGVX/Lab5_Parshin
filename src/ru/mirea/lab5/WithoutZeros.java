package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 9 */
public class WithoutZeros {
    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(recursion(a, b));
    }
}
