package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import static com.company.RomConvers.romanToArabic;
import static com.company.SanitationAndDataPreparation.Separate;
import static com.company.calculate.calculateRezalt;
import static com.company.consol.readString;
import static com.company.BackToArabic.BackToArabic;
import static com.company.SanitationAndDataPreparation.PreCheck;
import static com.company.erorHending.*;

public class Main {
    public static String FirstNum;
    public static String SecondNum;
    public static String Act;

    public static int a=0;
    public static int b=0;
    public static int r=0;
    public static boolean PrintRezalt = false;
    public static String TipeOfNum = "";





    public static void main(String[] args) throws Exception{
	// вводная часть
        System.out.println("Калькулятор готов к работе: ");
        System.out.println("Вы можете вводить арабские и римские цифры от 0 до 10 включительно. ");
        System.out.println("пробелы обязательны, в  вводимой строке должно быть два пробела");
        System.out.println("образец ввода: \"3 * 10\" или \"V + IX\"   ");
        System.out.println();

        // Ввод данных - получение строки
        String st = readString();

        // Проверка на наличие пробелов
        // Запуск вычислений
        if (PreCheck(st)) {



            // Разделяю сроку на три блока цифа 1, оператор, цифра 2. Возвращаю массивом.
            //  Для наглядости  разношу значения массива в различные переменные,
            // Интересно как повлияет на производительность если вместо переменных везде поставить вызов метода Separate?
            FirstNum = (String) Separate(st).get(0);
            SecondNum = (String) Separate(st).get(2);
            Act = (String) Separate(st).get(1);

            /*  Проверяю 1e чтo используется только латиский шрифт, 2что в однойстроке нет Арбских и римских цифр,
            3е в третьем блоке только символы * /  - +    */
            if (checkLatinAndDigit(FirstNum, SecondNum) && checkArabRom (FirstNum, SecondNum) ) {

                // Проверяю если цифры арабские сразу преобразую в числа
                if (checkDigits(FirstNum, SecondNum)) {
                    a = Integer.parseInt(FirstNum);
                    b = Integer.parseInt(SecondNum);
                    TipeOfNum = "arab";

                    // если цифры Римские то преобразую их в арабские числа
                } else {
                    a = romanToArabic(FirstNum);
                    b = romanToArabic(SecondNum);
                    TipeOfNum = "rom";

                }
                //Проверяю не буде ли деления на ноль
                if (CheckDividZerro(b, Act)) {


                    // проверяю что все числа меньше 10ти если это так произвожу вычисления.
                    if (a != -999999 || b != -999999) {
                        if (a <= 10 && b <= 10) {

                            r = calculateRezalt(Act, a, b); PrintRezalt = true;
                        } else {
                            System.out.println("Ошибка: Оба числа должны быть менее 10ти");
                        }
                    }

                }
            }



        }
        if (PrintRezalt){
            if (TipeOfNum == "arab") {
                System.out.println(r);
            } else {
                if (TipeOfNum == "rom") {
                    System.out.println(BackToArabic(r));
                }
            }

        }




    }
}
