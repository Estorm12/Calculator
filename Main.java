package com.company.Calc;

import java.io.IOException;
import java.util.Arrays;

class Calculator {

    public static void main(String[] args) throws IOException {
        System.out.println("Калькулятор принимает арабские или римские числа от 1 до 10.\nВозможные операции: +, -, *, /.\nВедите выражение в формате ЧИСЛО ОПЕРАЦИЯ ЧИСЛО. Например: 5 + 2 или II * V.");

        String[] roman = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabic = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        com.company.Calc.StringIn.in();
        String[] in = com.company.Calc.StringIn.getInput();

        String num1 = in[0];
        String num2 = in[2];

        if (Arrays.asList(arabic).contains(num1) && Arrays.asList(arabic).contains(num2)) {
            com.company.Calc.CalculateArabic.calculate();
        } else if (Arrays.asList(roman).contains(num1) && Arrays.asList(roman).contains(num2)) {
            com.company.Calc.CalculateRoman.calculate();
        }
          else {
            System.out.println("Ошибка!");
        }
    }

}