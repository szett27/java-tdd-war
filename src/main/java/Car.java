import java.util.ArrayList;
import java.util.List;

public class Car {

    private int fulltank = 20;
    private int currenttank;
    private int mpg = 10;
    private List<String> trips= new ArrayList<>();
    private int odometer;


    public float getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(float currentStation) {
        this.currentStation = currentStation;
    }

    private float currentStation;

    public List<String> getTrips() {
        return trips;
    }

    public Car(){
        this.currenttank = 0;
        this.currentStation = 101.1f;
    }

    public int getTank() {
        return this.currenttank;
    }

    public void setTank(int tank) {
        this.currenttank = tank;
    }



    public void fill(int fuel) {
        this.currenttank += fuel;
    }

    public void drive(int miles, Driver driver) {

        this.currenttank -= miles/this.mpg;
        this.trips.add(miles + " miles");
        this.setOdometer(miles);

        if(this.currenttank <= this.fulltank * .20){
            driver.setLowGasAlert(true);
        }

    }

    public int getOdometer() {
       return this.odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer += odometer;
    }

    public void alertDriver(Driver driver) {

    }
}
