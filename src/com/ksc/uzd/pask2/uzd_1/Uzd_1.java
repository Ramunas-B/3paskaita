package com.ksc.uzd.pask2.uzd_1;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-28.
 */
public class Uzd_1 {
    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu:");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        System.out.println(getText(numb));
    }

    private static String getText(int numb) {
        String text = "This number is odd";
        if (numb % 2 == 0) {
            text = "This number is even";
        }
        return text;
    }
}
