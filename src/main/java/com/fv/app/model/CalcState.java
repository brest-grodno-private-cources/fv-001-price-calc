package com.fv.app.model;

import com.fv.app.calc.Calculator;
import com.fv.app.calc.CalculatorImpl;

import java.math.BigDecimal;
import java.util.List;

public class CalcState implements Status{

    List<String> values;
    Calculator calculator = new CalculatorImpl();
    public CalcState(List<String> values) {
        this.values = values;
    }

    @Override
    public Status handle() {
       // Calculator calculator = new CalculatorImpl();
        BigDecimal result = calculator.handle(Double.valueOf(values.get(0)), Double.valueOf(values.get(1)), Double.valueOf(values.get(2)), Double.valueOf(values.get(3)));
        System.out.println("Result = " + result);
        return new ReadDataState();
    }

    @Override
    public StatusType getType() {
        return StatusType.CALC;
    }
}
