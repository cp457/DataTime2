import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTime2 {
    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.now();
        LocalDateTime data2 = LocalDateTime.now().plusHours(1).plusMinutes(2).plusSeconds(3);

     
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd-MMM-YYY")));
        System.out.println(data2.format(DateTimeFormatter.ofPattern("HH:mm:ss")));


        System.out.println(data.toLocalDate());
        System.out.println(data.toLocalTime());

    }
}

/*
    using LocaleDateTime, the current date and time in the following format: DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
    using ZonedDateTime, the current date and time in ISO Zoned Date Time format
 */