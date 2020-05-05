package com.company;

public class erorHending {

    public static boolean checkArabRom (String f, String s){
        boolean j=false;
        if ( (f.matches("^[0-9]+$") && s.matches("^[0-9]+$")) ||
                (f.matches("^[a-zA-Z]+$") && s.matches("^[a-zA-Z]+$")) ){
            j=true;
        } else {
            System.out.println("Не используйте арабские и римские цифры в одной строке");
        }

        return j;
    }

// Проверяю что переданные строки состоят только из латинских символов и цифр
    public static boolean checkLatinAndDigit (String f, String s){
        boolean j=false;
        if ( (f.matches("^[a-zA-Z0-9]+$") && s.matches("^[a-zA-Z0-9]+$"))) {
            j = true;
        }else {
            System.out.println("Пожалуйста используйте латинские буквы");
        }

        return j;
    }

// Проверяю что переданные строки состоят только из цифр
    public static boolean checkDigits (String f, String s){
        boolean j=false;
        if ( (f.matches("^[0-9]+$") && s.matches("^[0-9]+$"))) {
            j = true;
        }

        return j;    }


    public static boolean CheckDividZerro (int b, String s){
        boolean j=false;
        if ( (b != 0) || (!s.equals("/")) ) {
            j = true;
        } else {
            System.out.println("OШИБКА! деление на ноль запрещено! и/Или не возможно.");
        }

        return j;  }





}
