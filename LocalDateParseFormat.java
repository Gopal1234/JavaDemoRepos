
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateParseFormat {

    public static void main(String[] args) {
        // Define a custom format
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // 1. Parsing String into LocalDate
        String dateStr = "15-09-2025";
        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed LocalDate: " + date);

        // 2. Formatting LocalDate into String
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(formatter);
        System.out.println("Formatted String: " + formattedDate);

        // 3. Another format example (MMM dd, yyyy)
        DateTimeFormatter fancyFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String fancyDate = today.format(fancyFormatter);
        System.out.println("Fancy format: " + fancyDate);
    }
}
