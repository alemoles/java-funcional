package com.devtromo.composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = num -> {
            System.out.println("Multiplicando x: " + num + " por 3");
            return num * 3;
        };
        Function<Integer, Integer> add1MultiplyBy3 = multiplyBy3.compose(y -> {
            System.out.println("Le agregare 1 a: " + y);
            return y + 1;
        });
        Function<Integer, Integer> andSquare = add1MultiplyBy3.andThen(x -> {
            System.out.println("Estoy elevando " + x + " al cuadrado");
            return x * x;
        });
        System.out.println(add1MultiplyBy3.apply(5));
        System.out.println(andSquare.apply(5));
    }
}
