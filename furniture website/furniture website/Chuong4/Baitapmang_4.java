package Chuong4;

import java.util.Scanner;

public class Baitapmang_4 {
    public static void main(String[] args) {
        //khai bao va khoi tao mang 2 chieu
        int arr[][]={{5,12,17,9,3},{13,4,8,6,1},{9,6,3,7,21}};

        //in mang hai chieu
        for(int i=2;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
