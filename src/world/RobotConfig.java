package world;

public class RobotConfig extends Config{

    public RobotConfig(double x, double y, double alpha) {
        super(x, y, alpha);
    }

    public Point getCenter() {
        return new Point(getVector().get(0), getVector().get(1));
    }

    public double getx() {
        return getVector().get(0);
    }

    public double gety() {
        return getVector().get(1);
    }

    public double getAlpha() {
        return getVector().get(2);
    }
}
