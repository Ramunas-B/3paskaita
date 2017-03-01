package com.ksc.uzd.pask2.uzd_1;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-28.
 */
public class ucd_8 {
    public static void main(String[] args) {

        int Ats;
        int i;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.printf("Iveskite 1-a skaiciu:");
            int sk1 = Integer.valueOf(sc.nextLine());
            System.out.printf("Iveskite 2-a skaiciu:");
            int sk2 = Integer.valueOf(sc.nextLine());
            System.out.printf("Pasirinkite veiksma: 1 – suma, 2 – skirtumas, 3 – sandauga: ");
            String veiks = sc.nextLine();

        switch (veiks) {
            case "1":
                Ats = sk1 + sk2;
                System.out.printf("Atsakymas yra: %d  ", Ats);
                break;
            case "2":
                Ats = sk1 - sk2;
                System.out.printf("Atsakymas yra: %d  ", Ats);
                break;
            case "3":
                Ats = sk1 * sk2;
                System.out.printf("Atsakymas yra: %d  ", Ats);
                break;
        }
            System.out.printf("\nJeigu norite testi toliau iveskite betkoki skaiciu, jeigu baigti 5: ");
            i = Integer.valueOf(sc.nextLine());

        } while (!(i==5));
        }

    }

