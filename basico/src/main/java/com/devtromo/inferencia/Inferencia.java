package com.devtromo.inferencia;

import java.util.List;
import java.util.function.Function;

import com.devtromo.reference_operator.NombreUtils;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora = integer -> "Al double: " + (integer * 2);
        List<String> alumnos = NombreUtils.getList("Hugo", "Paco", "Luis");
        alumnos.forEach((String name) -> System.out.println(name));
        alumnos.forEach(name -> System.out.println(name));
    }
}
