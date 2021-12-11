package com.techreturners.exercise005;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Exercise005 {

    public boolean isPangram(String input) {

        int abcENG = 26;

        //"The quick brown fox jumps overrr the lazyyy   doggggg"
        //eliminate all empty chars
        input = (input.toLowerCase(new Locale("en", "US"))).replaceAll("\\s+", "");

        if (!isAlpha(input)) return false;

        //split each char into array
        String[] str = input.split("(?!^)");

        //group by the multiple chars by HashSet
        Set result = new HashSet(Arrays.asList(str));

        if (result.size()!= abcENG)
            return false;

        return true;
    }

    public static boolean isAlpha(String name) {
        return name.matches("[a-z]+");
    }

}
