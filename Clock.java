package lb9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Clock {

    
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    private LocalDateTime ldt;
    private DateTimeFormatter formatter;

    
    public Clock() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    
    public void setClock(int y, int mon, int d, int h, int min, int s) {

        year = y;
        month = mon;
        day = d;
        hour = h;
        minute = min;
        second = s;

        ldt = LocalDateTime.of(year, month, day, hour, minute, second);

        System.out.println("Clock Manual Configured DateTime is: "
                + ldt.format(formatter));
    }

    
    public void autoSetClock() {

        ldt = LocalDateTime.now();

        System.out.println("Clock Auto Configured DateTime is: "
                + ldt.format(formatter));
    }

    
    public void tickClock() {

        System.out.println("-- Ticking clock --");

        for (int i = 0; i < 1000; i++) {

            ldt = ldt.plusSeconds(1);

            System.out.println(ldt.format(formatter));

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    
    public void tickClock(int tick) {

        System.out.println("-- Ticking clock --");

        for (int i = 0; i < tick; i++) {

            ldt = ldt.plusSeconds(1);

            System.out.println(ldt.format(formatter));

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}