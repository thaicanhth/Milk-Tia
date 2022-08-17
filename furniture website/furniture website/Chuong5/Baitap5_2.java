package Chuong5;

import java.util.Scanner;

public class Baitap5_2 {
    static int LinearSearch(int a[], int n, int x)
    {
        for (int i = 0; i < n; i++)
            if (a[i] == x)
                return i;
            return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[]= {2,8,1,21,9,32,5,12,0};
        System.out.println("Nhập giá trị cần tìm: ");
        int giatri= scanner.nextInt();
        int ketqua=LinearSearch(a,a.length,giatri);
        if (ketqua==-1)
            System.out.println("Không tìm thấy giá trị: " + giatri);
        else
            System.out.println("Gía trị nhập vào từ bàn phím: " + ketqua);
    }
}



