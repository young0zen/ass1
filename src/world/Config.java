package world;

import java.util.ArrayList;

public class Config {
    private ArrayList<Double> vector;

    public Config(double... configs) {
        vector = new ArrayList(0);
        for(double e : configs) {
            vector.add(e);
        }
    }

    public Config(ArrayList<Double> configs) {
        for(Double e : configs) {
            vector.add(e);
        }
    }

    public ArrayList<Double> getVector() {
        return vector;
    }
}
