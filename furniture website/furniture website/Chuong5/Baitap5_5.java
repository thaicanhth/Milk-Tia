package Chuong5;

import java.util.Scanner;

public class Baitap5_5 {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột: ");
        n = scanner.nextInt();

        // khai báo ma trận A có m hàng, n cột
        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(A[i][j]);
            }
        }

        // tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Gía trị lớn nhất của mảng = " + max);
    }
}

