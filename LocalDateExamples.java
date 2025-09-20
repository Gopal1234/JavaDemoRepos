
import java.time.LocalDate;
import java.time.Period;

public class LocalDateExamples {

    public static void main(String[] args) {
        // 1. Create LocalDate and compare
        LocalDate today = LocalDate.now();
        LocalDate independenceDay = LocalDate.of(1947, 8, 15);
        System.out.println("Today: " + today);
        System.out.println("Independence Day: " + independenceDay);
        System.out.println("Is today after Independence Day? " + today.isAfter(independenceDay));

        // 2. Calculate period (difference between two dates)
        LocalDate birthDate = LocalDate.of(1990, 5, 20);
        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears() + " years " +
                age.getMonths() + " months " + age.getDays() + " days");

        // 3. Add days/months/years
        LocalDate projectStart = LocalDate.of(2025, 1, 1);
        LocalDate deadline = projectStart.plusMonths(6).plusDays(10);
        System.out.println("Project Start: " + projectStart);
        System.out.println("Deadline (+6 months, +10 days): " + deadline);

        // 4. Subtract days/months/years
        LocalDate examDate = LocalDate.of(2025, 12, 1);
        LocalDate preparationStart = examDate.minusWeeks(8);
        System.out.println("Exam Date: " + examDate);
        System.out.println("Start Preparation (8 weeks before): " + preparationStart);

        // 5. Compare two dates (before/after)
        LocalDate d1 = LocalDate.of(2025, 9, 15);
        LocalDate d2 = LocalDate.of(2025, 12, 31);
        if (d1.isBefore(d2)) {
            System.out.println(d1 + " is before " + d2);
        } else if (d1.isAfter(d2)) {
            System.out.println(d1 + " is after " + d2);
        } else {
            System.out.println("Both dates are equal");
        }
    }
}
