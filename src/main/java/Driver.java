import java.util.List;

public class Driver {

    public boolean getLowGasAlert() {
        return this.lowGasAlert;
    }

    public void setLowGasAlert(boolean lowGasAlert) {
        this.lowGasAlert = lowGasAlert;
    }

    private boolean lowGasAlert;

    public List<Float> getFavoriteStations() {
        return favoriteStations;
    }

    public void setFavoriteStations(List<Float> favoriteStations) {
        this.favoriteStations = favoriteStations;
    }

    List<Float> favoriteStations;

    public void fillupTank(Car car, int fuel) {
        car.fill(fuel);
    }


}
