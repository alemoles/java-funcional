package com.devtromo.reference_operator;

import java.util.Arrays;
import java.util.List;

public class NombreUtils {
    static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }
}
