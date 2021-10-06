package Task13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseString {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd h:m:s a", Locale.US);
        LocalDateTime parsedDateTime = LocalDateTime.parse("1999/Jun/18 07:34:56 PM", formatter);
        System.out.println(parsedDateTime);
    }
}
