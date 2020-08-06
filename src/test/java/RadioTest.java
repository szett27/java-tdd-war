import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

//    As a driver, I want my car to save my six favorite radio stations
//    As a driver, I want to be able to select the radio station from a list of my favorite stations to listen to
//    As a driver, I want to be able to fill up my gas tank
//    As a driver, I want to be able to see how much gas is in my tank
//    As a car, I want my gas tank to decrease by .5% with each mile driven
//    As a car, I want to alert the driver when there is only 10% gas remaining so they fill it up

    @Test
    void radioCanSaveOneRadioStation(){
        Radio radio = new Radio();
        radio.setFavorites(101.1f);

        List<Float> actual = radio.getFavorites();
        List<Float> expected = new ArrayList<>();
        expected.add(101.1f);
        assertEquals(expected, actual);

    }

    @Test
    void radioCanSaveSixStations(){
        Radio radio = new Radio();
        radio.setFavorites(101.1f);
        radio.setFavorites(102.1f);
        radio.setFavorites(103.1f);
        radio.setFavorites(104.1f);
        radio.setFavorites(105.1f);
        radio.setFavorites(106.1f);
        List<Float> actual = radio.getFavorites();
        List<Float> expected = new ArrayList<>();
        expected.add(101.1f);
        expected.add(102.1f);
        expected.add(103.1f);
        expected.add(104.1f);
        expected.add(105.1f);
        expected.add(106.1f);
        assertEquals(expected, actual);

    }


}


