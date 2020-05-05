package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class consol {
    public static String readString() throws Exception {

        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String st = str.readLine();
        return st;

    }
}
