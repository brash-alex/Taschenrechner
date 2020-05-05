package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RomConvers {

enum RomanNumeral {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

    private int value;

    RomanNumeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNumeral> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}



    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            System.out.println("\""+ input+ "\"" + " не получилсь сконвертировать, точно это Римские цифры?");
            result = -999999;
        }

        return result;
    }
}





/*
public static int  convert ( String st) {
        int ConvertDigits = 0;

        st = st.toLowerCase(Locale.forLanguageTag(st));
        switch (st) {
            case "i":
                ConvertDigits = 1;
                break;
            case "ii":
                ConvertDigits = 2;
                break;
            case "iii":
                ConvertDigits = 3;
                break;
            case "iv":
                ConvertDigits = 4;
                break;
            case "v":
                ConvertDigits = 5;
                break;
            case "vi":
                ConvertDigits = 6;
                break;
            case "vii":
                ConvertDigits = 7;
                break;
            case "viii":
                ConvertDigits = 8;
                break;
            case "ix":
                ConvertDigits = 9;
                break;
            case "x":
                ConvertDigits = 10;
                break;
            case "iix":
                ConvertDigits = 8;
                break;
            default:
                ConvertDigits = 99999;
        }




    return ConvertDigits;
    }
 */
