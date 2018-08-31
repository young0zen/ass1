package world;

import java.util.List;

public class BoxConfig extends Config {

    public BoxConfig(List<Obstacle> obs) {
        for(Obstacle o : obs) {
            getVector().add(o.getx());
            getVector().add(o.gety());
        }
    }
}
