package sampler;

import java.util.Random;

import com.sun.xml.internal.rngom.parse.host.Base;
import world.BoxConfig;
import world.Config;
import world.RobotConfig;

public class RandomSampler extends BaseSampler implements Sampler {
    Random r = new Random();

    RandomSampler(Config initial) {
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
