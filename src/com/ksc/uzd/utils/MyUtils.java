package com.ksc.uzd.utils;

import java.util.List;

/**
 * Created by Probook on 2017-03-01.
 */
public class MyUtils {

    public static <E>void printList(List<E> list){
        for(E e : list){
            System.out.println(e);
        }
    }
}
