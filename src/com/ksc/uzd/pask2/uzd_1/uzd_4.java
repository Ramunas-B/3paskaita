package com.ksc.uzd.pask2.uzd_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Probook on 2017-02-28.
 */

public class uzd_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i = 1;
        int sum = 0;
        while (!(i==0)){
            System.out.println("Iveskite skaiciu: ");
            try{
                i=sc.nextInt();
                sum = sum + i;
            } catch (InputMismatchException e){
                System.out.println("Blogai ivestas skaicius");
                sc.nextLine();
            }
           // i = Integer.valueOf(sc.nextLine());
        }
        System.out.println("Suma: " +sum);
    }
}
