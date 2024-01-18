package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Lab2ProblemsTest {

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertTrue(Lab2Problems.isPrime(17));
        assertFalse(Lab2Problems.isPrime(465));
        assertFalse(Lab2Problems.isPrime(0));
        assertTrue(Lab2Problems.isPrime(7919));
    }

    @org.junit.jupiter.api.Test
    void primeFactors() {
        assertEquals(Collections.emptyList(), Lab2Problems.primeFactors(17));


        List<Integer> expectedFactorsFor60 = Arrays.asList(2, 2, 3, 5);
        assertEquals(expectedFactorsFor60, Lab2Problems.primeFactors(60));


        assertEquals(Collections.emptyList(), Lab2Problems.primeFactors(1));


        assertEquals(Collections.emptyList(), Lab2Problems.primeFactors(0));
    }
}