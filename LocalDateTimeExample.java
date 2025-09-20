import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime: " + now);

        // Create a specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2025, 9, 20, 15, 30, 45);
        System.out.println("Specific DateTime: " + specificDateTime);

        // Add and subtract time
        LocalDateTime plusDays = now.plusDays(5);
        LocalDateTime minusHours = now.minusHours(3);
        System.out.println("After 5 days: " + plusDays);
        System.out.println("3 hours ago: " + minusHours);

        // Formatting DateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // Parsing String to LocalDateTime
        String dateTimeStr = "25-12-2025 10:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr, formatter);
        System.out.println("Parsed DateTime: " + parsedDateTime);
    }
}
