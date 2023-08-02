package com.nixsolutions.ppp.basetypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class NumericOperationsHandler implements BaseTypesUtil {

    @Override
    public String plus(String value1, String value2) {

        BigDecimal num1 = new BigDecimal(value1);
        BigDecimal num2 = new BigDecimal(value2);

        BigDecimal result = num1.add(num2);

        return result.toPlainString();
    }

    @Override
    public String minus(String value1, String value2) {
        BigDecimal num1 = new BigDecimal(value1);
        BigDecimal num2 = new BigDecimal(value2);

        BigDecimal result = num1.subtract(num2);

        return result.toPlainString();
    }

    @Override
    public String mul(String value1, String value2) {

        BigDecimal num1 = new BigDecimal(value1);
        BigDecimal num2 = new BigDecimal(value2);

        BigDecimal result = num1.multiply(num2);

        return result.toPlainString();
    }

    @Override
    public String div(String value1, String value2) {
        BigDecimal num1 = new BigDecimal(value1);
        BigDecimal num2 = new BigDecimal(value2);

        BigDecimal result = num1.divide(num2);

        return result.toPlainString();
    }
}
