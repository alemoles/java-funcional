package com.devtromo.sam;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

class AgeUtilsTest {

    @Test
    public void testTriFunction() {
        Function<Integer, String> addZeros = x -> x < 10 ? "0" + x : String.valueOf(x);
        AgeUtils.TriFunction<Integer, Integer, Integer, LocalDate> parseDate = (day, month, year) -> LocalDate.parse(
            year + "-" + addZeros.apply(month) + "-" + addZeros.apply(day));
        AgeUtils.TriFunction<Integer, Integer, Integer, Integer> calculateAge = (day, month, year) -> Period.between(parseDate.apply(day, month, year),
                LocalDate.now())
            .getDays();

        assertEquals(26, calculateAge.apply(10, 10, 1992));
    }

}