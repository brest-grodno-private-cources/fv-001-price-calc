package com.fv.app.calc;

import java.math.BigDecimal;

public class CalculatorImpl implements Calculator{

    @Override
    public BigDecimal handle(double PricePerKg, double PricePerKm, double ParamKg, double ParamKm) {
        return (BigDecimal.valueOf(PricePerKg)).multiply(BigDecimal.valueOf(ParamKg)).add
                (BigDecimal.valueOf(PricePerKm)).multiply(BigDecimal.valueOf(ParamKm));
    }
}
