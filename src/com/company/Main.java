package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount of rows");
        int rows = sc.nextInt();
        System.out.println("enter the amount of columns");
        int nums = 1;
        int columns = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            System.out.println("\n");
            for (int j = 0; j < columns; j++) {
                if (nums>9) {
                    System.out.print(nums + ",");
                    nums++;
                }
                else{
                    System.out.print(nums + ", ");
                    nums++;
                }
            }
        }
    }
}
