package Task13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2002, 4, 18, 23, 56);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m yyyy/MM/dd");
        String formattedDateTime = localDateTime.format(formatter);

        System.out.println(formattedDateTime);
    }
}
