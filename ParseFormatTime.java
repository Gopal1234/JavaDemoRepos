
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseFormatTime {
    public static void main(String[] args) {
        // Parse time from string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime t1 = LocalTime.parse("14:30:15", formatter);
        System.out.println("Parsed Time: " + t1);

        // Format LocalTime to string
        String formatted = t1.format(DateTimeFormatter.ofPattern("hh:mm a"));
        System.out.println("Formatted Time: " + formatted);
    }
}
