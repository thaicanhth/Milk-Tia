package Chuong5;

import java.util.Scanner;

public class Baitap5_3 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mang: ");
        n = scanner.nextInt();

        int A[] = new int[n];


        System.out.println("Nhập các phần tử cho mang: ");
        for (int i = 0; i < n; i++) {

            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
        // tìm phần tử có giá trị lớn nhất của mảng
        // giả sử phần tử tại vị trí (0) là phần tử lớn nhất
        int max = A[0];

        for (int i = 0; i < n; i++) {
                if (max < A[i]) {
                    max = A[i];
                }
            }

        System.out.println("Gía trị lớn nhất = " + max);
    }
}



