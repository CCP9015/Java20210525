package car;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("zxc-123");
        Car c2 = new Car("asd-456");
        Car c3 = new Car("qwe-789");
        cars.put(c1.id,c1);
        cars.put(c2.id,c2);
        cars.put(c3.id,c3);
        String id = "zxc-123";
        Car car = cars.get(id);
        if(car == null){
            System.out.println("Car is not found");
        }else {
            Date now = new Date();
            long dis = now.getTime() - car.enter.getTime();
            long mins = dis/(1000*60);
            System.out.println(mins);
        }
    }
}
