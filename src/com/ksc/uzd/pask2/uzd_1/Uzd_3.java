package com.ksc.uzd.pask2.uzd_1;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-28.
 */
public class Uzd_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while (!(i==0)){
            System.out.println("Iveskite skaiciu: ");
            i = Integer.valueOf(sc.nextLine());
            sum = sum + i;
        }
        System.out.println("Suma: " +sum);
    }
}
