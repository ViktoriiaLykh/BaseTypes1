package com.nixsolutions.ppp.basetypes;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class NumberFormatterByLocale implements BaseTypesUtil {

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
}
