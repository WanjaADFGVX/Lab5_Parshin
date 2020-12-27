package ru.mirea.lab5;
import java.util.Scanner;

public class TriangularSequence {

    public static String recursion(int j) {
        int a = 0;
        int b = 0;

        if (j == 1) {
            return "1";
        } else {
            for (int i = 1; a < j; i++) {
                a += i;
                b = i;
            }
            System.out.print(recursion(--j) + " " + b);
        }
        return "";
    }

    public static void main(String[] args) {

        /* Задание 1, Версия 1 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;

        for (int i = 1; i < n + 1; i++){
            System.out.println(k);
            if (i == k*(k + 1)/2)
                k += 1;
        }

        /* Задание 1, Версия 2 */
        Scanner cc = new Scanner(System.in);
        int c = cc.nextInt();
        recursion(c);
    }

}
