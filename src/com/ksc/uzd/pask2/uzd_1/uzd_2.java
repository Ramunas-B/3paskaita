package com.ksc.uzd.pask2.uzd_1;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-28.
 */
public class uzd_2 {

    public static void main(String[] args) {
        //System.out.println("Please insert a word: ");
        Scanner sc = new Scanner(System.in);
        String word = " ";

        while (!word.equals("pabaiga")){
            System.out.println("Please insert a word");
            word = sc.nextLine();

        }
    }

}
