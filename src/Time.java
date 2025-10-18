import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;


public class Time {
    int millis = 1000;

    public void getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.getTime();
    }
}



