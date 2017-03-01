package com.ksc.uzd.pask2.uzd_1;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-28.
 */
public class Uzd_7 {
    public static void Skaiciavimas(int[] sk){
        int kiek = sk.length;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < kiek; i++) {
            System.out.printf("Iveskite %d skaiciu: ", i + 1);
            sk[i] = Integer.valueOf(sc.nextLine());
            sum = sum + sk[i];
        }
        System.out.println("Skaiciai didesni uz 100 yra:");
        for (int i = 0; i < kiek; i++) {
            if (sk[i] > 100) {
                System.out.printf("Skaicius %d yra: %d \n", i + 1, sk[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu bus ivedinejama:");
        int kiek = Integer.valueOf(sc.nextLine());
        int[] sk = new int[kiek];
        Skaiciavimas(sk);
        }
        //System.out.println("Skaiciu suma: " + sum);
    }

