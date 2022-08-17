package Chuong4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
/*
Gioi thieu lop Arrays
 */
public class Video3 {
    public Video3() {
        super();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,3,2,0,1,4,7,8,9,10,13} ;
        String[] names = {"Than", "Hoa", "Hung", "Khanh", "Trung", "Nam"};
        String res = Arrays.toString(arr);
        System.out.println(res);
        System.out.println(names);

    //  int index = Arrays.binarySearch(names, "Nam");
    //  int index = Arrays.binarySearch(names, 0,5,"Nam");

    //  System.out.println("sau khi sap xep: ");
    //  System.out.println(Arrays.toString(names));
        String[] name2 = Arrays.copyOf(names, names.length);
        System.out.println("Names = " + Arrays.toString(names));
        System.out.println("Name2 = " + Arrays.toString(name2));

        System.out.println("Index = " + Arrays.toString(name2));
        System.out.println("is names equals name2 ?"+Arrays.equals(names,name2));
        int [] myArray = new int[20];
        Arrays.fill(myArray, 99);
        System.out.println(Arrays.toString(myArray));
    }
}
