package com.fv.app.model;

import javax.swing.plaf.DimensionUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDataState implements Status{

    public static final int NUMBER_NEEDED_VALUES = 4;

    Scanner scanner = new Scanner(System.in);
    List<String> values = new ArrayList<>();
    String[] systemMessages = {
            "Please enter PricePerKg",
            "Please enter PricePerKm",
            "Please enter mass in Kg",
            "Please enter road in Km"
    };

    String helpMessage = " (or press 'q' to exit) = ";

    @Override
    public Status handle() {
        while (values.size() < NUMBER_NEEDED_VALUES) {

            System.out.print(systemMessages[values.size()] + helpMessage);
            String enteredValue = scanner.next();
            if (enteredValue.equals("q")) {
                return new ExitState();
            }

            if (isCorrectValue(enteredValue)) {
                values.add(enteredValue);
            }
        }

            return new CalcState(values);
    }

    private boolean isCorrectValue(String value) {

        boolean checkResult = true;

        try {
            Double ev = Double.valueOf(value);
            if (ev <= 0 ) {
                System.out.println("Entered value should be >0 ");
                checkResult = false;
            }

        } catch (NumberFormatException ex) {
            System.out.println("Please enter correct value: ");
            checkResult = false;
        }

        return checkResult;

    }

    @Override
    public StatusType getType() {
        return StatusType.READ_DATA;
    }
}
