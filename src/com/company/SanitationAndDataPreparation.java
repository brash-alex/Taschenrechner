package com.company;


import java.util.ArrayList;
import java.util.List;

public class  SanitationAndDataPreparation {
/*
Пре чек проеряет есть ли арифм оператор и отеделны ли цыфры пробелами, и на всякий случай что пробелов именно два.))
 */
    public static boolean PreCheck(String st) {
        boolean precheck = false;


        // считаю количество пробелов в строке удаля все другие символы
        if (st.replaceAll("[^ ]", "").length() != 2) {

            System.out.println("Ошибка ввода: В строке должно быть два пробела");
            return precheck;
        } else {
            // Если пробелов два ищу символ арифмитического оператора
            int q = -2;
            for (int i = 0; i < st.length(); i++) {

                if ((st.charAt(i)) == '*' || (st.charAt(i)) == '/' || (st.charAt(i)) == '-' || (st.charAt(i)) == '+') {
                    q = i;
                }

            }
            // Если значение q не изменнено (-2) выдаю ошибку и завершаю
            if (q == -2) {
                System.out.println("Ошибка ввода арифметический оператор не найден ( * / - +)");return precheck;}
            // иначе, проверяю стоят ли во кругоператора по пробелу
            else {
                if (!Character.isWhitespace(st.charAt(q--)) && !Character.isWhitespace(st.charAt(q++))) {

                    System.out.println("Ошибка ввода: Пробел должен разделять цифры и арифметический оператор");
                    return precheck;
                }
                precheck = true;
            }
        }

        return precheck;
    }

/*
Разеделяю полученную строку на три "блока" цифра один цифра два и возвращаю их массивом
 */

    public static List Separate(String uhh) {
        List<String> separt = new ArrayList<String>();
        //firstdig = ""
        String  se = "";
        int act=0;

        for (int i = 0; i < uhh.length(); i++) {

            if (!Character.isWhitespace(uhh.charAt(i))) {
                se = se + uhh.charAt(i);
            } else { act = i; i=i+2;  separt.add(se); se="";

                }


        }

        //separt.add(firstdig);
        separt.add( Character.toString(uhh.charAt(++act)) );
        separt.add(se);
        return separt;


    }
}






