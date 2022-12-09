package com.devtromo.optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null) {
            // Operar con nombres.
        }
        Optional<List<String>> namesOptional = getOptionalNames();
        if (namesOptional.isPresent()) {
            // Operar con nombres.
        }
        namesOptional.ifPresent(namesValue -> namesValue.forEach(System.out::println));
        //        namesOptional.flatMap();
        Optional<String> valuablePlayer = mostValuablePlayerOptional();
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "Default");
        System.out.println(valuablePlayerName);
    }

    static List<String> getNames() {
        List<String> list = new ArrayList<>();
        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        return null;
    }

    static int mostExpensiveItem() {
        return -1;
    }

    static Optional<List<String>> getOptionalNames() {
        List<String> list = new ArrayList<>();
        return Optional.of(list);
    }

    static Optional<String> mostValuablePlayerOptional() {
        //        return Optional.ofNullable();
        return Optional.empty();
    }

    static int mostExpensiveItemOptional() {
        return -1;
    }
}
