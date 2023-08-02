package com.nixsolutions.ppp.basetypes;

import java.util.stream.IntStream;

public abstract class ArrayArithmeticMeanCalculator implements BaseTypesUtil {

    @Override
    public float arithmeticMean(int[] array) {
        return (float) IntStream.of(array).average().orElse(0);
    }
}
