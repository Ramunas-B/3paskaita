package com.ksc.uzd.pask2.uzd_1;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-28.
 */
public class uzd_5 {
    public static void main(String[] args) {
        int[]sk=new int[5];
        int sum = 0;
        for (int i=0; i<5; i++) {
            System.out.printf("Iveskite %d skaiciu: ",i+1);
            Scanner sc = new Scanner(System.in);
            sk[i] = Integer.valueOf(sc.nextLine());
            sum = sum + sk[i];
        }
        for (int i=0; i<5; i++){
            System.out.printf("Skaicius %d yra: %d \n",i+1,sk[i]);
        }
        System.out.println("Skaiciu suma: "+sum);
    }
}
