
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2025, 1, 1);
        LocalDate d2 = LocalDate.of(2025, 9, 15);

        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Days between: " + days);
    }
}
