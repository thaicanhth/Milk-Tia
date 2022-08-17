package Chuong4;

import java.util.Scanner;

public class Baitap4_3 {
    private static Scanner input;
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài của mảng: ");
        size= scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Phần tử thứ " + i + ": " + arr[i] );
        }
        int test = 0;
        System.out.print("\nso chinh phuong cua mang la: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++)
                if (j * j == arr[i]) {
                    System.out.print(arr[i] + " ");
                    test++;
                }
        }
    }
}



