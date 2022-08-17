package Chuong6;

import java.util.Scanner;

public class Baitap6_5 {
    public static void main(String[] args) {
        int n;

        // biến đếm số nguyên dương n
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số nguyên dương n: ");
            n = scanner.nextInt();
        } while (n < 0);

        int A[] = new int[n];

        System.out.println("Nhập vào các số nguyên dương n: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào số nguyên dương n " + i + ": ");
            A[i] = scanner.nextInt();
        }

        // Đếm số lần xuất hiện của 1 số nguyên dương n
        System.out.println("Nhập vào 1 số nguyên dương n: ");
        int number = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (A[i] == number) {
                count++;
            }
        }

        System.out.println("Số nguyên dương " + number + " có trong n = " + count);
    }
}
