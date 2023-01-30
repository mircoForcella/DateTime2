import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime2 {
    public static void main(String[] args) {
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd/MMMM/yy HH:mm");
        System.out.println(localTime.format(formatTime).toUpperCase());

        ZonedDateTime zoned = ZonedDateTime.now();
        DateTimeFormatter formatZoned = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        System.out.println(zoned.format(formatZoned));



    }
}
