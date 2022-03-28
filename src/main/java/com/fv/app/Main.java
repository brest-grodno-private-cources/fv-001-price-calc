package com.fv.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean working = true;
        boolean PrConst = true;
        String str = "";
        double PricePerKg=0, PricePerKm=0, ParamKg=0, ParamKm=0;

        do {

            if (PrConst == true) {

                System.out.println("\nHello! \nPlease enter tne next constant. If you want to change they, press 'c' \nFor exit, press 'q' \n");

                Scanner in = new Scanner(System.in);
                System.out.print("Input PricePerKg = ");
                str = in.next();

                if (str.equals("q")) {
                    break;

                } else if (str.equals("c")) {
                    PrConst = true;
                    continue;
                } else {
                    PricePerKg = Double.parseDouble(str);
                    PrConst = false;
                }

                System.out.print("Input PricePerKm = ");
                str = in.next();

                if (str.equals("q")) {
                    break;
                } else if (str.equals("c")) {
                    PrConst = true;
                    continue;
                } else {
                    PricePerKm = Double.parseDouble(str);
                    PrConst = false;
                }

            }
            else if (PrConst == false) {

                Scanner in = new Scanner(System.in);

                System.out.print("Input ParamKg = ");
                str = in.next();

                if (str.equals("q")) {
                    break;
                } else if (str.equals("c")) {
                    PrConst = true;
                    continue;
                } else {
                    ParamKg = Double.parseDouble(str);
                }

                System.out.print("Input ParamKm = ");
                str = in.next();

                if (str.equals("q")) {
                    break;
                } else if (str.equals("c")) {
                    PrConst = true;
                    continue;
                } else {
                    ParamKm = Double.parseDouble(str);
                }

                System.out.println("Final PRICE = " + (PricePerKg*ParamKg + PricePerKm*ParamKm) + " \n");
            }
        }
        while (working == true);

    }
}