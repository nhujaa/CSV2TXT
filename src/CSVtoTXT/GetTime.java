package CSVtoTXT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetTime {
    public static String getTime(){
        DateTimeFormatter time = DateTimeFormatter.ofPattern("MMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        return time.format(now);
    }
}
