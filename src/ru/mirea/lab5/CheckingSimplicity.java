package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 6 */
public class CheckingSimplicity {
    public static String recursion(int n, int i) {

        if (n < 2) {
            System.out.println("Yes");
        } else if (n == 2) {
            System.out.println("Yes");
        } else if (n % i == 0) {
            System.out.println("No");
        } else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            System.out.println("Yes");
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(recursion(i, 2));
    }

}
