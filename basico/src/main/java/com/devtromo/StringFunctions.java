package com.devtromo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        //        quote.apply("Hola Estudiante de Platzi!");
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hola Estudiante de Platzi!"));
        System.out.println(addMark.apply("Hola"));

        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;
        System.out.println(multiplicacion.apply(2, 3));
        BinaryOperator<Integer> multiplicacion2 = (x, y) -> x * y;
        System.out.println(multiplicacion2.apply(2, 3));
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftPad.apply("Java", 10));
        List<BiFunction<String, Integer, String >> formatters = new ArrayList<>();
    }
}
