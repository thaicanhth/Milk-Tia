package Chuong4;

import java.util.Scanner;

public class Baitap4_4 {
    public Baitap4_4() {
        super();
    }

    public static void main(String[] args) {
        int n, m;
        int kt = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        n = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        m = scanner.nextInt();
        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: " );
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "\t");
                sum += A[i][j];
            }
            System.out.println(sum + "\n");
        }
        {
            System.out.println("Nhập vào số bậc của ma trận: ");
            n = scanner.nextInt();
        }
        {
            System.out.println("Nhập vào số bậc của ma trận: ");
            n = scanner.nextInt();
        }
        while (n < 1);
        // ma trận A là ma trận vuông
        // có n dòng và n cột
        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (A[i][j] == A[j][i]){
                    kt = 1;
                }else {
                    kt = 0;
                }
            }
        }
        if (kt == 1){
            System.out.println("Ma trận vừa nhập là ma trận đối xứng");
        }else {
            System.out.println("Ma trận vừa nhập là ma trận không đối xứng");
        }
    }
}

