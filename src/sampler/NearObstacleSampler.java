package sampler;

import world.BoxConfig;
import world.Config;
import world.RobotConfig;

public class NearObstacleSampler extends BaseSampler implements Sampler {

    NearObstacleSampler(Config initial) {
        super(initial);
    }

    @Override
    public BoxConfig sampleBox() {
        return null;
    }

    @Override
    public RobotConfig sampleRobot() {
        return null;
    }
}
