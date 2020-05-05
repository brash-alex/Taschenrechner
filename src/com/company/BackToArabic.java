package com.company;

public class BackToArabic {

    public static String BackToArabic(int r) {
        String rezalt = "Не удалось конвертировать результат в Римские цифры";
        if (r>3999) {rezalt = "Результат больше MMMCMXCIX (3999) К сожалению  я не умею показывать числа больше MMMCMXCIX";}

        if (r < 11) {
            switch (r) {
                case 1:
                    rezalt = "I";
                                    break;
                case 2:
                    rezalt = "II";

                break;
                case 3:
                    rezalt = "III";

                break;
                case 4:
                    rezalt = "IV";

                break;
                case 5:
                    rezalt = "V";

                break;
                case 6:
                    rezalt = "VI";

                break;
                case 7:
                    rezalt = "VII";

                break;
                case 8:
                    rezalt = "VIII";

                break;
                case 9:
                    rezalt = "IX";

                break;
                case 10:
                    rezalt = "X";

                break;

            }
        } else {
            int i = 0;
            while (r > 0) {
                if (r / 1000 != 0) {
                    rezalt = "M";
                    r = r - 1000;
                    for (i = 0; i < r / 100; i++) {
                        rezalt = rezalt + "M";
                        r = r - 1000;
                    }
                }
                if (r / 500 != 0) {
                    rezalt = "D";
                    r = r - 500;
                    for (i = 0; i < r / 100; i++) {
                        rezalt = rezalt + "D";
                        r = r - 500;
                    }
                }
                if (r / 100 != 0) {
                    rezalt = "C";
                    r = r - 100;
                    for (i = 0; i < r / 100; i++) {
                        rezalt = rezalt + "C";
                        r = r - 100;
                    }
                }
                if (r / 50 != 0) {
                    rezalt = "L";
                    r = r - 50;
                    for (i = 0; i < r / 100; i++) {
                        rezalt = rezalt + "L";
                        r = r - 50;
                    }
                }
                if (r / 10 != 0) {
                    rezalt = "X";
                    for (i = 0; i < r / 10; i++) {
                        rezalt = rezalt + "X";
                        r = r - 10;
                    }
                }
                if (r / 5 != 0) {
                    rezalt = "V";
                    r = r - 5;
                    for (i = 0; i < r / 100; i++) {
                        rezalt = rezalt + "V";
                        r = r - 5;
                    }
                }
            }
        }

        return rezalt;
    }

}
