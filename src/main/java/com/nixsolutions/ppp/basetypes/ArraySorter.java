package com.nixsolutions.ppp.basetypes;

import java.util.Arrays;

public abstract class ArraySorter implements BaseTypesUtil {

    @Override
    public int[] sort(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }
}
