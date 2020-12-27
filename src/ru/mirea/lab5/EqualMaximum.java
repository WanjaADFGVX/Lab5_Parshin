package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 16*/
public class EqualMaximum {
    public static void recursion(int max, int cnt) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            } else if (n == max) {
                recursion(max, ++cnt);
            } else {
                recursion(max, cnt);
            }
        } else {
            System.out.println(cnt);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0);
    }
}
