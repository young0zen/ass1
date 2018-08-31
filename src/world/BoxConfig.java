package world;

import sampler.Sampler;
import sampler.RandomSampler;

import java.util.List;

public class BoxConfig extends Config {

    //initial
    public BoxConfig(List<Obstacle> obs) {
        for(Obstacle o : obs) {
            getVector().add(o.getx());
            getVector().add(o.gety());
        }
    }

}
