package Chuong5;

import java.util.Random;

public class Baitap5_1 {
    private static final int [] n ={0,5,8,9,1,15};
    public static void main(String[] args) {
        int temp;
        for (int i = 0; i < n.length - 1 ; i++){
            for (int j = 0; j < n.length - 1; j++){
                if (n [j]<n[j + 1]){
                    temp = n [j];
                    n [j] = n [j + 1];
                    n [j + 1] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n.length; i++){
            System.out.println(n[i] + " ");
        }
    }
}
