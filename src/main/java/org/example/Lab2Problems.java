package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lab2Problems {
    public static boolean isPrime(int n){

        if (n < 2) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> primeFactors(int n){

        List<Integer> factors = new ArrayList<>();


        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }


        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }


        if (Lab2Problems.isPrime(n) && n > 2) {
            factors.add(n);
        }

        return factors;
    }
}
