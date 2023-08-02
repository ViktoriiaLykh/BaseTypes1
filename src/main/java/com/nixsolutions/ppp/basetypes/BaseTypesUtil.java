
    package com.nixsolutions.ppp.basetypes;

    public interface BaseTypesUtil {

        /**
         * Transforms a number written in scientific notation to a regular form and vice versa. <p>
         *
         * If the input string parameter is a number written in scientific notation,
         * the output will be the same number but in a regular form. <p>
         *
         * And vice versa, if the input string is a number written in a regular form,
         * the output will be a string representation of the same number but written in scientific notation.
         *
         * @param str
         * @return
         */
        String toggleScientificNotation(String str);

        /**
         * Returns a sorted copy of the input <i>array</i>. <p>
         * The original <i>array</i> <b>must not</b> be changed.
         *
         * @param array
         * @return
         */
        int[] sort(int[] array);

        /**
         * Returns an arithmetic average of values passed in the input <i>array</i>.
         *
         * @param array
         * @return
         */
        float arithmeticMean(int[] array);

        /**
         * Returns a string representation of the floating-point number <i>n</i> formatted using the specific locale.
         * that corresponds to the specified <i>language</i>
         *
         * @param n        number to be formatted
         * @param language <i>ISO 639</i> compliant 2 or 3 letter long language code
         * @return
         */
        String format(double n, String language);

        /**
         * Sums two numbers of arbitrary type and precision. <p>
         * The result must not be formatted.
         *
         * @param value1
         * @param value2
         * @return
         */
        String plus(String value1, String value2);

        /**
         * Subtracts <i>value2</i> from <i>value1</i>. The input numbers are of arbitrary type and precision. <p>
         * The result must not be formatted.
         *
         * @param value1
         * @param value2
         * @return
         */
        String minus(String value1, String value2);

        /**
         * Returns a product of two numbers of arbitrary type and precision. <p>
         * The result must not be formatted.
         *
         * @param value1
         * @param value2
         * @return
         */
        String mul(String value1, String value2);

        /**
         * Divides <i>value1</i> by <i>value2</i>. The input numbers are of arbitrary type and precision. <p>
         * The result must not be formatted.
         *
         * @param value1
         * @param value2
         * @return
         */
        String div(String value1, String value2);

    }

