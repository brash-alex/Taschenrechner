package com.company;

public class BackToArabic {

    public static String BackToArabic(int r) {
        String rezalt = "Не удалось конвертировать результат в Римские цифры";
        if (r>3999) {rezalt = "Результат больше MMMCMXCIX (3999) К сожалению  я не умею показывать числа больше MMMCMXCIX";}

        if (r < 11) {
            rezalt = FirstTen(r);

        } else {

            int i = 0;
            String temp = "";
            while (r > 0) {
                if (r / 1000 != 0) {
                    i = r/1000;
                    for (int j =0; j < i; j++){
                        temp = temp + "M";
                    }
                    r = r%1000;

                }
                rezalt = temp;
                temp = "";


                if (r / 500 != 0) {
                    if (r/100 >=9){
                        temp = "CM";
                        r= r-(100*9);
                    }else {
                            temp = temp + "D";
                            r = r-500;
                            }
                    }
                rezalt = rezalt + temp;
                temp = "";


               if (r / 100 != 0) {
                    if (r/100 >=4){
                        temp = "CM";
                        r= r-(100*4);
                    }else {
                        i = r / 100;
                        for (int j = 0; j < i; j++) {
                            temp = temp + "C";
                            r = r%100;
                        }
                    }
                } rezalt = rezalt + temp;
                temp = "";

                if (r / 50 != 0) {
                    if (r/10 >=9){
                        temp = "XC";
                        r= r-(10*9);
                    }else {
                        temp = temp + "L";
                        r = r%50;
                    }
                }
                rezalt = rezalt + temp;
                temp = "";


                if (r / 10 != 0) {
                    if (r/10 >=4){
                        temp = "XL";
                        r= r-(10*4);
                    }else {
                        i = r / 10;
                        for (int j = 0; j < i; j++) {
                            temp = temp + "X";
                            r = r%10;
                        }
                    }
                }
                rezalt = rezalt + temp + FirstTen(r);;
                r=0;

            }
        }

        return rezalt;
    }

    public static String FirstTen (int r) {
        String rezalt ="";

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
            System.out.println("Ошибка: входящее число больше 10ти");
        }
        return rezalt;
    }


}
