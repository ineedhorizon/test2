package ru.gost.interview.issuethree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCounter {

    private static final Pattern WORD_PATTERN = Pattern.compile("[\\wА-Яа-яЁё']+");

    /**
     * Count words in text
     *
     * @param text
     * @return Sorted map with words
     */
    public Map<String, Integer> countWords(String text) {
        return countWords(text, false);
    }

    public Map<String, Integer> countWords(String text, boolean caseSensitive) {
        Map<String, Integer> map = new HashMap<>();

        Matcher matcher = WORD_PATTERN.matcher(text);
        while (matcher.find()) {
            String s = caseSensitive ? matcher.group() : matcher.group().toLowerCase();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        LinkedHashMap::new));
    }
}