
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/*
 * "HH:mm" → 24-hour (00–23)

"hh:mm a" → 12-hour (01–12) with AM/PM

"HH:mm:ss" → 24-hour with seconds

"hh:mm:ss a" → 12-hour with seconds and AM/PM
 * 
 * 
 * 
 */
public class TimeFormatExample {
    public static void main(String[] args) {
    	String str="10:05:45PM";
    	
        //LocalTime now = LocalTime.now();
    	LocalTime now=LocalTime.now();

        // 24-hour format
        String time24 = now.format(DateTimeFormatter.ofPattern("HH:mm:ss a"));
        System.out.println("24-hour format: " + time24);

        // 12-hour format with AM/PM
        String time12 = now.format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
        System.out.println("12-hour format: " + time12);

        // Parsing a 12-hour time string
      /*  String timeStr = "02:30:15 PM";
        LocalTime parsed = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("hh:mm:ss a"));
        System.out.println("Parsed from 12-hour: " + parsed); // prints 14:30:15*/
    }
}
