package ru.gost.interview.issuetwo;

import java.math.BigDecimal;

import static ru.gost.interview.issuetwo.Factorial.factorial;

public class FormulaCalculator {

    /**
     * Calculate formula m!/r!(m-r)! for r <= m
     *
     * @param r - Natural number, must be less or equals m
     * @param m - Natural number
     * @return result
     */
    public static BigDecimal calc(int r, int m) {
        if (r > m) {
            throw new IllegalArgumentException("'r' must be less or equals 'm'.");
        }

        return factorial(m).divide(factorial(r).multiply(factorial(m - r)), 3, BigDecimal.ROUND_HALF_UP);
    }
}
