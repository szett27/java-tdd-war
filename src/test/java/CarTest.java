import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {


    @Test
    void doesNewCarHaveNoGas(){
        Car car = new Car();
        int actual = car.getTank();
        int expected = 0;
        assertEquals(expected, actual);

    }
    @Test
    void doesTheCarFillUpWithGas(){
        Car car = new Car();
        car.fill(10);
        int actual = car.getTank();
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void doesTheCarFillUpWithGasTwice(){
        Car car = new Car();
        car.fill(5);
        car.fill(6);
        int actual = car.getTank();
        int expected = 11;
        assertEquals(expected, actual);

    }


    @Test
    void carUsesGasWhileItDrives(){
        Car car = new Car();
        Driver driver = new Driver();
        car.fill(10);
        car.drive(50, driver);
        int actual = car.getTank();
        int expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    void incrementsCarOdometer(){
        Car car = new Car();
        Driver drive = new Driver();
        car.fill(10);
        car.drive(50, drive);
        int actual = car.getOdometer();
        int expected = 50;
        assertEquals(expected, actual);

    }


    @Test
    void carRecordsTripsItTakes(){
        Car car = new Car();
        Driver driver = new Driver();
        car.fill(10);
        car.drive(50, driver);
        car.drive(25, driver);
        List<String> actual = car.getTrips();
        List<String> expected = new ArrayList<>();
        expected.add("50 miles");
        expected.add("25 miles");
        assertEquals(expected, actual);

    }

}
