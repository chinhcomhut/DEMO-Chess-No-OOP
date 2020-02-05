package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[][] Board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(Board[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int[] xy = new int[]{3, 3};
        int[] nextXY = new int[]{4, 4};

        if (kiemTraNuocDiQuanTuong4(xy, nextXY)) {
            System.out.println("Nuoc di dung");
        } else {
            System.out.println("Nuoc di sai");
        }


    }
//Tinh huong 1 quan tuong di cheo len ve ben phai
    static boolean kiemTraNuocDiQuanTuong(int[] xy, int[] nuocDi) {
        int x = xy[0];
        int y = xy[1];

        int nextX = nuocDi[0];
        int nextY = nuocDi[1];

        // Tinh huong 1
        int i = x, j = y;
        while (i < 8 && j >= 0) {
            i++;
            j--;

            if (i == nextX && j == nextY) {
                return true;
            }
        }
        return false;
    }
    //tinh huong 2 quan tuong di cheo len ve ben trai
    static boolean kiemTraNuocDiQuanTuong2(int[] xy, int[] nuocDi) {
        int x = xy[0];
        int y = xy[1];
        int nextX = nuocDi[0];
        int nextY = nuocDi[1];
        int i =x, j=y;
        while (i<8 && j>=0){
            i--; j--;
            if (i==nextX && j==nextY) {
                return true;
            }
        }
        return false;
    }
    //Tinh huong 3 quan tuong di cheo xuong ve ben trai
    static boolean kiemTraNuocDiQuanTuong3(int[]xy, int nuocDi[]) {
        int x = xy[0], y=xy[1];
        int nextX = nuocDi[0], nextY = nuocDi[1];
        int i = x, j = y;
        while (i<8 && j>=0) {
            i--; j++;
            if (i == nextX && j==nextY) {
                return true;
            }
        }
        return false;
    }
    //Tinh huong 4 quan tuong di cheo xuong ve ben phai
    static boolean kiemTraNuocDiQuanTuong4(int[]xy, int nuocDi[]) {
        int x = xy[0], y = xy[1];
        int nextX = nuocDi[0], nextY = nuocDi[1];
        int i = x, j = y;
        while (i<8 && j >=0) {
            i++; j++;
            if (i == nextX && j == nextY){
                return true;
            }
        }
        return false;
    }

}


//Tinh huong 2
//static boolean tinhhuong2(int[]xy, int[] nuocdi){
//        int x = xy[0];
//        int y = xy[1];
//        int nextX = nuocdi[0];
//        int nextY = nuocdi[1];
//
//    //Tinh huong 2
//    int i = x;
//    int j = y;
//
//    return false;
//}



