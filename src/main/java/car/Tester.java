package car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date d = sdf.parse("02:23");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Car c1 = new Car("zxc-123");
        Car c2 = new Car("asd-456","02:30");
        System.out.println(c1.enter);

        Date now = new Date();
        System.out.println(now.getTime());
        long dis = now.getTime() - c1.enter.getTime();
        System.out.println(dis);
    }
}
