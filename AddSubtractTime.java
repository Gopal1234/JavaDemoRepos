
import java.time.LocalTime;

public class AddSubtractTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        LocalTime after2Hours = now.plusHours(2);
        LocalTime before30Minutes = now.minusMinutes(30);

        System.out.println("Current Time: " + now);
        System.out.println("After 2 hours: " + after2Hours);
        System.out.println("30 minutes before: " + before30Minutes);
    }
}
