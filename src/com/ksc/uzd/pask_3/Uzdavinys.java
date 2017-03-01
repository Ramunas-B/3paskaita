package com.ksc.uzd.pask_3;

import com.ksc.uzd.utils.MyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Probook on 2017-03-01.
 */
public class Uzdavinys {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //ArrayList<String> names = new ArrayList<>();
        readFile("persons.txt", names);
        Collections.sort(names); //rusiuos pagal alfabeta
        MyUtils.printList(names);
        writeFile(names, "persons.txt");
    }

    private static void writeFile(List<String> names, String fileName){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName), true));
            for(String name : names){
                bw.write(name);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Cant write to file"+fileName);
        }
    }

    private static void readFile(String fileName, List<String> names) {
        File file = new File(fileName);
        try {
            FileReader reader = new FileReader(file);
            // BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
            BufferedReader bf = new BufferedReader(reader);
            String name = null;
            try {
                while ((name = bf.readLine()) != null) {
                    names.add(name);
                }
            } catch (IOException e) {
                //e.printStackTrace();
                System.out.println("Can't read line" + e);
            } finally {
                try {
                    bf.close();
                } catch (IOException e) {
                    System.out.println("Can't close reader," + e);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file >>" + fileName);
        }
    }
}
