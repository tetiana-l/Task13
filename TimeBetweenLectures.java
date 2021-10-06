package Task13;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class TimeBetweenLectures {

    public static void main(String[] args) {
        LocalDateTime localDateTime =
                LocalDateTime.of(2020, 8, 24, 20, 0, 0);

        LocalDateTime localDateTime1 =
                LocalDateTime.of(2020, 8, 28, 18, 0, 0);

        long days = localDateTime.until(localDateTime1, DAYS);
        System.out.println("days " + days);
        long hours = localDateTime.until(localDateTime1, ChronoUnit.HOURS);
        System.out.println("hours " + hours);
        long minutes = localDateTime.until(localDateTime1, ChronoUnit.MINUTES);
        System.out.println("minutes " + minutes);
        long seconds = localDateTime.until(localDateTime1, ChronoUnit.SECONDS);
        System.out.println("seconds " + seconds);
    }
}
