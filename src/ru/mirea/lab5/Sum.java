package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 4 */
public class Sum {
    public static int recursion(int length, int sum, int k, int s) {

        if (length == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int a;
        if (length != 0) {
            a = 0;
        } else {
            a = 1;
        }
        int result = 0;

        for (int i = a; i < 10; i++) {
            result += recursion(length + 1, sum + i, k, s);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();
        System.out.println(recursion(0, 0, k, s));
    }

}
