package com.nixsolutions.ppp.basetypes;

public abstract class ScientificNotationConverter implements BaseTypesUtil {

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
}
