package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 13*/
public class PrintOddSequence {
    public static void recursion() {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

        if (n > 0) {
        int m = in.nextInt();
        if (m > 0) {
            recursion();
            System.out.println(n);
        }
    }
}
    public static void main(String[] args) {
        recursion();
    }
}
