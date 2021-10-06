package Task13;

import java.time.Duration;
import java.time.LocalTime;

public class LectureDuration {

    public static void main(String[] args) {

        LocalTime start = LocalTime.of(20, 0);
        LocalTime end = LocalTime.of(22, 0);

        Duration duration = Duration.between(start, end);
        System.out.println(duration);

        long durationInMinutes = duration.toMinutes();
        long durationInSeconds = duration.getSeconds();

        System.out.println("Duration in minutes: " + durationInMinutes
                + "\nDuration in seconds: " + durationInSeconds);
    }
}
