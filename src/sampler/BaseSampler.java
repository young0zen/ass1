package sampler;

import world.Config;

abstract public class BaseSampler {
    Config config;

    BaseSampler(Config initial) {
        config = initial;
    }
}
