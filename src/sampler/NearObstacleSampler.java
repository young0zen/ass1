package sampler;

import world.Config;

public class NearObstacleSampler implements Sampler {

    @Override
    public Config sample() {
        return new Config(0, 0, 0);
    }
}
