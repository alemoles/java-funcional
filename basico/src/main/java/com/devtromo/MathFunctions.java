package com.devtromo;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };

        int result = square.apply(10);
        System.out.println(result);

        Function<Integer, Boolean> isOdd = number -> number % 2 == 1;
        Predicate<Integer> isEven = number -> number % 2 == 0;

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;
        Student someone = new Student(5.9);
        System.out.println(isApproved.test(someone));

        isEven.test(4); // true
    }

    static class Student {
        private final double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
