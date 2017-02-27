package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in); //scanner = terminal buffering function build-in.

    public static void main(String[] args) {

        int number;
        number = input.nextInt();
        //para string input.nextLine()

        InLineAsterisc(number);
        VerticalAsterisc(number);
        RightTriangle(number);
        Centered(number);
    }
    public static void InLineAsterisc(int counter) {
            int i;
            String asterisc = "*";
            for (i = 1; i < counter; i++) {
                System.out.print(asterisc);
            }
    }

    public static void VerticalAsterisc(int counter) {
            int i;
            String asterisc = "*";
            for (i = 0; i < counter; i++) {
                System.out.println(asterisc);
            }
    }


    public static void RightTriangle(int counter) {
            int i;
            String asterisc = "";
            for (i = 0; i < counter; i++) {
                asterisc = asterisc + "*";
                System.out.println(asterisc);
            }
    }


    public static void Centered(int counter) {

        int medium = counter;
        
        int i;
        String asterisc = "";
        for (i = 0; i < counter; i++) {
            asterisc = asterisc + "*";
            System.out.println(asterisc);

        }
    }
}