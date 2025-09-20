
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeDifference {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);

        long hours = ChronoUnit.HOURS.between(start, end);
        long minutes = ChronoUnit.MINUTES.between(start, end);

        System.out.println("Work Duration: " + hours + " hours (" + minutes + " minutes)");
    }
}
