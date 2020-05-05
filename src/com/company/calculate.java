package com.company;

public class calculate {

    public static int calculateRezalt (String z, int a, int b){
        int w=0;
        switch (z){
            case "+" : w=a+b;break;
            case "*" : w=a*b;break;
            case "/" : w=a/b;break;
            case "-" : w=a-b;break;

            default:
                System.out.println("Арифместический оператор не распознан пожалуйтсав введите  *  / + или -");;
        }
        return w;
    }







}
