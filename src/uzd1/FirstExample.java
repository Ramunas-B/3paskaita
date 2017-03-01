package uzd1;

import java.util.Scanner;

/**
 * Created by Probook on 2017-02-27.
 */
public class FirstExample {
    public static void main (String[] args){
        System.out.println("Please insert your name");
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("You inserted >>"+name);
    }
}
