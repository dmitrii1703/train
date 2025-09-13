package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final ZoneId MOSCOW_ZONE = ZoneId.of("Europe/Moscow");
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("ddMMyyyy");

    public static String checkData(int plus) {
        ZonedDateTime nowMoscow = ZonedDateTime.now(MOSCOW_ZONE);
        return nowMoscow.plusDays(plus).format(FORMATTER);
    }
}
