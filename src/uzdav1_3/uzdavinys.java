package uzdav1_3;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-27.
 */
public class uzdavinys {
    public static void main(String[] args) {
        System.out.println("Iveskite 1-a skaiciu:");
        Scanner sc = new Scanner(System.in);
        int sk1 = Integer.valueOf(sc.nextLine());
        System.out.println("Iveskite 2-a skaiciu:");
        int sk2 = Integer.valueOf(sc.nextLine());
        System.out.print("Atsakymas:");
        System.out.print("Skaiciu suma yra:"+Suma(sk1,sk2));
        System.out.println(" ");
        System.out.print("Skaiciu skirtumas yra:"+Skirtumas(sk1,sk2));

    }
    public static double Suma(double sk1, double sk2){
        double suma = 0;
        suma = sk1 + sk2;
        return suma;
    }
    public static double Suma(int sk1, int sk2) {
        int suma = 0;
        suma = sk1 + sk2;
        return suma;
    }
    public static double Skirtumas(double sk1, double sk2){
        double skirtumas = 0;
        skirtumas = sk1 - sk2;
        return skirtumas;
    }
    public static double Skirtumas(int sk1, int sk2){
        int skirtumas = 0;
        skirtumas = sk1 - sk2;
        return skirtumas;
    }


    }
