package com.devtromo.immutability;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ImmutabilityTest {

    @Test
    public void testNoImmutability() {
        List<String> expected = Arrays.asList("notengo@email.com", "notengo1@email.com", "notengo2@email.com");
        List<String> emails = new ArrayList<>();
        String email = "notengo@email.com";
        String email1 = "notengo1@email.com";
        String email2 = "notengo2@email.com";
        emails.add(email);
        emails.add(email1);
        emails.add(email2);
        assertEquals(expected, emails);
        InmutablePerson person = new InmutablePerson("Inmutable", emails);
        assertEquals(expected, person.getEmails());
        ReallyInmutablePerson reallyImmutablePerson = new ReallyInmutablePerson("Inmutable", emails);
        assertEquals(expected, reallyImmutablePerson.getEmails());
        emails.add("badmutation@email.com");
        assertNotEquals(expected, person.getEmails());
        // not change because we do a deep copy
        assertEquals(expected, reallyImmutablePerson.getEmails());
    }

    private class InmutablePerson {
        private final String nombre;
        private final List<String> emails;

        private InmutablePerson(String nombre, List<String> emails) {
            this.nombre = nombre;
            this.emails = emails;
        }

        public String getNombre() {
            return nombre;
        }

        public List<String> getEmails() {
            return emails;
        }
    }

    private class ReallyInmutablePerson {
        private final String nombre;
        private final List<String> emails;

        private ReallyInmutablePerson(String nombre, List<String> emails) {
            this.nombre = nombre;
            this.emails = new ArrayList<>(emails);
        }

        public String getNombre() {
            return nombre;
        }

        public List<String> getEmails() {
            return emails;
        }
    }
}
