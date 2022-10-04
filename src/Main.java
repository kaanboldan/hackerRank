import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String stringDate= DateFor.format(date);
        System.out.println(stringDate);

    }
}