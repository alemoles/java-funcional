package com.devtromo.reference_operator;

import static com.devtromo.reference_operator.NombreUtils.getList;

import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

class NombreUtilsTest {

    @Test
    public void testRefOperator() {
        List<String> profesores = getList("Nicolas", "Juan", "Zulema");

        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);
        profesores.forEach(System.out::println);
    }

}