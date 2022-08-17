package Chuong4;

import java.util.Scanner;

public class Vidu4_6 {
    public static void main(String[] args) {
        int m; // Số dòng của ma trận
        int n; // Số cột của ma trận
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Nhập vào số dong của ma trận:");
            m = scanner.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            n = scanner.nextInt();
        }
        while (m < 1 || n < 1) ;
        // khai báo 2 ma trận A và B có m dòng và n cột
        int A[][] = new int[m][n];
        int B[][] = new int[m][n];

// ma trận tổng C
        int C[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử cho ma trận B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Ma trận B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // Để tính tổng hai ma trận
        // ta sẻ sử dụng 2 vòng lặp for
        // để duyệt y
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

// hiển thị ma trận tổng C
        System.out.println("Ma trận tổng C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}





