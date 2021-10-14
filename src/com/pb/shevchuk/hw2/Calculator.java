package com.pb.shevchuk.hw2;

import javafx.util.converter.PercentageStringConverter;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c;
        System.out.print("Введите operand1: ");
        int operand1 = in.nextInt();
        System.out.print("Введите operand2: ");
        int operand2 = in.nextInt();
        System.out.print("Введите действие ");
        String v = in.next();
        char sign = v.charAt(0);
        switch (sign) {
            case '*':
                c= operand1*operand2;
                System.out.println("результат"+c);
                break;
            case '/':
                if (operand2==0) {
                    System.out.print("деление на 0 запрещено");
                break;
                }
        else{}

                c= operand1/operand2;
                System.out.println("результат"+c);
                break;
            case '+':
                c= operand1+operand2;
                System.out.println("Результат" +c);
            case '-':
                c= operand1-operand2;
                System.out.println("результат" +c);
                break;
            default:
                System.out.println("Неверный оператор");
        }


    }

}