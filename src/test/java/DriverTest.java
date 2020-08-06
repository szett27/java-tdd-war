import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {

    @Test
    void displayFavorites (){
        Radio radio = new Radio();
        Driver driver = new Driver();
        Car car = new Car();
        radio.setFavorites(101.1f);
        radio.setFavorites(102.1f);
        radio.setFavorites(103.1f);
        radio.setFavorites(104.1f);
        radio.setFavorites(105.1f);
        radio.setFavorites(106.1f);

        driver.setFavoriteStations(radio.getFavorites());
        List<Float> actual = driver.getFavoriteStations();
        List<Float> expected = new ArrayList<>();
        expected.add(101.1f);
        expected.add(102.1f);
        expected.add(103.1f);
        expected.add(104.1f);
        expected.add(105.1f);
        expected.add(106.1f);
        assertEquals(expected, actual);
    }

    @Test
    void selectFavoriteStation(){
        Radio radio = new Radio();
        Driver driver = new Driver();
        Car car = new Car();
        radio.setFavorites(101.1f);
        radio.setFavorites(102.1f);
        radio.setFavorites(103.1f);
        radio.setFavorites(104.1f);
        radio.setFavorites(105.1f);
        radio.setFavorites(106.1f);

        driver.setFavoriteStations(radio.getFavorites());
        car.setCurrentStation(driver.getFavoriteStations().get(2));

        float actual = car.getCurrentStation();
        float expected = 103.1f;

        assertEquals(expected, actual);
    }


    @Test
    void aDriverCanFillUpACarWithGas(){
        Driver driver = new Driver();
        Car car = new Car();

        driver.fillupTank(car, 20);

        int actual = car.getTank();
        int expected = 20;

        assertEquals(expected, actual);
    }

    @Test
    void alertDrivertoLowGas(){
        Driver driver = new Driver();
        Car car = new Car();

        car.fill(20);
        car.drive(100, driver);
        car.drive(100, driver);
        boolean actual = driver.getLowGasAlert();
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
