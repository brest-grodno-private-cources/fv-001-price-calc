package com.fv.app.calc;

import java.math.BigDecimal;

public interface Calculator {

    BigDecimal handle(double PricePerKg, double PricePerKm, double ParamKg, double ParamKm);

}
