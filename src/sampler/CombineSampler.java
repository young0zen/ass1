package sampler;

import sun.util.logging.PlatformLogger;
import world.BoxConfig;
import world.Config;
import world.RobotConfig;

public class CombineSampler extends BaseSampler
        implements Sampler{

    CombineSampler(Config initial) {
        super(initial);
    }

    @Override
    public RobotConfig sampleRobot() {
        return null;
    }

    @Override
    public BoxConfig sampleBox() {
        return null;
    }

}
