package ru.gost.interview;

import org.junit.Test;
import ru.gost.interview.issueone.TwoSevenPrinter;
import ru.gost.interview.issuethree.WordCounter;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static ru.gost.interview.issuetwo.FormulaCalculator.calc;

public class LaunchTest {

    private static final String text = "Test test, void. Null! Тест: тест \"тест\".";

    @Test
    public void IssueOne() {
        new TwoSevenPrinter().print(1, 100);
    }

    @Test
    public void IssueTwo() {
        BigDecimal rez = calc(4, 16);

        assertEquals(0, BigDecimal.valueOf(1820).compareTo(rez));

        System.out.println("m!/r!(m - r)! = " + rez);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IssueTwoException() {
        calc(3, 2);
    }

    @Test
    public void IssueThree() {
        Map<String, Integer> words = new WordCounter().countWords(text);

        assertEquals(Integer.valueOf(3), words.get("тест"));
        assertEquals(Integer.valueOf(2), words.get("test"));
        assertEquals(Integer.valueOf(1), words.get("void"));
        assertEquals(Integer.valueOf(1), words.get("null"));

        System.out.println(words);
    }
}
