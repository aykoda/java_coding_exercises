package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if(word == null || word.isEmpty() ) {
            return "";
        }

        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    public String generateInitials(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty())
            return "";

        String initials= Character.toUpperCase(firstName.charAt(0))
                +"."
                +Character.toUpperCase(lastName.charAt(0));

        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {

        if (originalPrice<=0)
            return 0.0;
        if (vatRate<=0)
            return originalPrice;

        vatRate = vatRate/100;
        double addRate = originalPrice + (originalPrice*vatRate);

        DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        double exVatStr = Double.valueOf(df.format(addRate));

        return exVatStr;
    }

    public String reverse(String sentence) {
        if (sentence == null || sentence.isEmpty())
            return "";

        StringBuilder bld = new StringBuilder(sentence);

        return bld.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {

        if (users.isEmpty())
            return 0;
        // group by to count the User by Type
        Map<String,Long> optionsByName = users.stream()
                .collect(
                        Collectors.groupingBy(User::getType, Collectors.counting())
                );
        //check the count value of "Linux" users
        for (Map.Entry<String,Long> entry : optionsByName.entrySet()) {
            if (entry.getKey().equals("Linux"))
                return entry.getValue().intValue();
        }
        return 0;
    }
}
