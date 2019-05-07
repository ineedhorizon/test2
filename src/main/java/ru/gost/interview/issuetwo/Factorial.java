package ru.gost.interview.issuetwo;

import java.math.BigDecimal;
import java.util.HashMap;

public class Factorial {

    private static HashMap<Integer, BigDecimal> cache = new HashMap<>();

    public static BigDecimal factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be positive or 0.");
        if (n == 0) return BigDecimal.ONE;
        if (cache.containsKey(n)) return cache.get(n);

        BigDecimal res;
        res = BigDecimal.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, res);

        return res;
    }
}
