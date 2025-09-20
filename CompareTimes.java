
import java.time.LocalTime;

public class CompareTimes {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(10, 15);
        LocalTime t2 = LocalTime.of(14, 45);

        if (t1.isBefore(t2)) {
            System.out.println(t1 + " is before " + t2);
        } else if (t1.isAfter(t2)) {
            System.out.println(t1 + " is after " + t2);
        } else {
            System.out.println("Both times are equal");
        }
    }
}
