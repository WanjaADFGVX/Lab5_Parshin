package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 12*/
public class PrintOdd {
    public static void recursion() {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {
            if (n % 2 == 1) {
                recursion();
                System.out.println(n);
            } else {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
