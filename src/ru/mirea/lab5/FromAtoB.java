package ru.mirea.lab5;
import java.util.Scanner;

/* Задание 3 */
public class FromAtoB {
    public static String recursion(int a, int b) {
        if (a == b)
            return Integer.toString(a);
        if (a > b) {
             return a + " " + recursion(a - 1, b);
        } else {
            return a + " " + recursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner ina = new Scanner(System.in);
        int a = ina.nextInt();
        int b = ina.nextInt();
        System.out.println(recursion(a, b));
    }

}
