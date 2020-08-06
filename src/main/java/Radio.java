import java.util.ArrayList;
import java.util.List;

public class Radio {

    List<Float> favorites = new ArrayList<>();

    public Radio(){
    }

    public List<Float> getFavorites() {
        return this.favorites;
    }

    public void setFavorites(float station) {
        this.favorites.add(station);
    }




}
