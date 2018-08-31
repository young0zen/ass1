package world;


import java.util.Random;

public class UniformSampler implements Sampler {
    Random r = new Random();

    @Override
    public Config sample() {
        //double x = r.nextInt();
        //double y = r.nextInt();
        //double alpha = r.nextInt();
        return new Config(0, 0, 0);
    }
}
