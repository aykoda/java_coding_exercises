package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise004 {

    LocalDateTime _date;
    public  Exercise004(LocalDate date) {
        _date = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        _date = dateTime;
    }

    public LocalDateTime getDateTime() {

        ZoneId zoneId = ZoneId.of("UTC");
        ZonedDateTime zdt = _date.atZone(zoneId);
        Calendar cal = GregorianCalendar.from(zdt);

        cal.add(Calendar.SECOND, 1_000_000_000);

        return LocalDateTime.ofInstant(cal.toInstant(), zoneId);
    }
}
