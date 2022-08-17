package Chuong5;
import java.util.Random;
import java.util.Scanner;
public class Baitapbuoi11 {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public  void sapXep(int a[], int n){
        for(int j=0;j<n;j++) {
            for (int i = n - 1; i > j; i--) {
                if (a[i]>a[i - 1]) {
                    int b = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = b;
                }
            }
        }
    }
    public static void main(String[] args) {
        Baitapbuoi11 j= new Baitapbuoi11 ();
        int n =10;
        Random x = new Random();
        int mang[] = new int[n];
        for (int i = 0; i < n; i++){
            mang[i] = x.nextInt(100);
        }
        for (int i = 0; i < n; i++){
            System.out.println(mang[i] + " ");
        }
        System.out.println("");
        j.sapXep(mang, n);

        for (int i = 0; i < n; i++){
            System.out.println(mang[i] + " ");
        }
    }
}
