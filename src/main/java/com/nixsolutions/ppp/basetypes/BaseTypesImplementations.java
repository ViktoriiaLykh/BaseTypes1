package com.nixsolutions.ppp.basetypes;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

public class BaseTypesImplementations implements BaseTypesUtil {
    @Override
    public String toggleScientificNotation(String str) {
        double value = Double.parseDouble(str);
        return isScientificNotation(str) ? scientificToRegularNotation(value) : regularToScientificNotation(value);
    }

    private static boolean isScientificNotation(String str) {
        return str.toLowerCase().matches("-?\\d+(\\.\\d+)?[eE][-+]?\\d+");
    }

    private static String scientificToRegularNotation(double value) {
        return String.format("%.20f", value).replaceAll("0*$|\\.$", "");
    }

    private static String regularToScientificNotation(double value) {
        String scientificNotation = String.format("%e", value);

        String[] parts = scientificNotation.split("e");
        String mantissa = parts[0];
        String exponent = parts[1].replaceAll("\\+", "");
        mantissa = mantissa.replaceAll("0*$|\\.$", "");


        exponent = exponent.replaceAll("^0*", "");
        if (exponent.isEmpty()) {
            exponent = "0";
        }

        return mantissa + "e" + exponent;
    }

    @Override
    public int[] sort(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }

    @Override
    public float arithmeticMean(int[] array) {
        return (float) IntStream.of(array).average().orElse(0);
    }

    @Override
    public String format(double n, String language) {
        Locale locale;
        try {
            locale = new Locale(language);
        } catch (IllegalArgumentException e) {
            locale = Locale.ENGLISH;
        }

        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        return numberFormat.format(n);
    }

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
