package com.fv.app;

import com.fv.app.calc.Calculator;
import com.fv.app.calc.CalculatorImpl;
import com.fv.app.model.ReadDataState;
import com.fv.app.model.Status;
import com.fv.app.model.StatusType;

import java.util.Scanner;
//
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Calc SYSTEM");
        Status currentStatus = new ReadDataState();
        while (currentStatus.getType() != StatusType.EXIT){
            currentStatus = currentStatus.handle();
        }
        currentStatus.handle();

/*       boolean working = true;
        boolean PrConst = true;
        String str = "";
        double PricePerKg=0, PricePerKm=0, ParamKg=0, ParamKm=0;

        do {

            if (PrConst == true) {

                System.out.println("\nHello! \nPlease enter tne next constant. If you want to change they, press 'c' \nFor exit, press 'q' \n");

                Scanner in = new Scanner(System.in);

                System.out.println(in.delimiter());

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

                //System.out.println("Final PRICE = " + (PricePerKg*ParamKg + PricePerKm*ParamKm) + " \n");

                //System.out.println("Final PRICE = " + new CalculatorImpl().handle(PricePerKg, PricePerKm, ParamKg, ParamKm) + " \n");

                Calculator calc = new CalculatorImpl();
                System.out.println("Final PRICE = " + calc.handle(PricePerKg, PricePerKm, ParamKg, ParamKm) + " \n");
            }
        }
        while (working == true);
*/

    }
}