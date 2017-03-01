package uzd1_8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Probook on 2017-02-27.
 */
public class usd1_8 {
    public static void main(String[] args){
        System.out.print("Iveskite nuvaziuotus kilometrus: ");
        Scanner sc = new Scanner(System.in);
        int km = Integer.valueOf(sc.next());
        System.out.print("Iveskite kiek sunaudota degalu litrais: ");
        double deg = Double.valueOf(sc.next());
        Double vidurkis = (deg * 100)/km;
        DecimalFormat pav = new DecimalFormat("#.##");
        System.out.println("Vidurkis 100 km. :"+pav.format(vidurkis));
        //BigDecimal big = new BigDecimal(vidurkis);
        //System.out.println("Vidurkis 100 km. :"+big.round(new MathContext(3)));

    }
}
