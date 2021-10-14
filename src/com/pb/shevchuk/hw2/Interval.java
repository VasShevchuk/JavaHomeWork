package com.pb.shevchuk.hw2;

import java.util.Scanner;

public class Interval {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int operand1 = in.nextInt();
        if (0<=operand1 )
        if (operand1 <=14)
        {
            System.out.print("Число попадает в промежуток  [0 -14]");
        } else

        if (15<=operand1 )
            if (operand1 <=35)
            {
                System.out.print("Число попадает в промежуток  [15 -35]");}

            else

            if (36<=operand1 )
                if (operand1 <=50)
                {
                    System.out.print("Число попадает в промежуток  [36 -50]");}

                else

                if (51<=operand1 )
                    if (operand1 <=100)
                    {
                        System.out.print("Число попадает в промежуток  [51 -100]");}

                    else

                        {
                            System.out.print("Число не попадает в заданые промежутки");}

        }
}
