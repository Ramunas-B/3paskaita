package uzd1_6;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-27.
 */
public class uzd1_6 {
    public static void main(String[] args){
        System.out.print("Iveskite savo ugi:");
        Scanner sc = new Scanner(System.in);
        double ugis = Double.valueOf(sc.next());
        System.out.print("Iveskite savo svori:");
        double svoris = Double.valueOf(sc.next());
        Double KMI = svoris/(ugis*ugis);
        System.out.println("Jusu KMI:"+KMI);
    }
}
