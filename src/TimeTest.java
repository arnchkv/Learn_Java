class Time {
    int hour;
    int minutes;
    int seconds;

    void printTime() {
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}

/**
 * TimeTest
 */
public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();

        t.hour = 23;
        t.minutes = 34;
        t.seconds = 56;

        t.printTime();
    }

}