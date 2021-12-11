package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester( Person person ) {

        if (person==null)
            return false;

        return person.getCity().equals("Manchester");
    }

    public boolean canWatchFilm( Person person, int ageLimit) {

        return person.getAge() >= ageLimit ? true : false;
    }
    
}
