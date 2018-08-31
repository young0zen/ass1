package world;

public class Robot {
    private Point center;
    private double alpha;
    private double length;

    public Robot(double x, double y, double alpha) {
        center = new Point(x, y);
        this.alpha = alpha;
    }

    public double getx() {
        return center.x;
    }

    public double gety() {
        return center.y;
    }

    public double getAlpha() {
        return alpha;
    }

    public Point getCenter() {
        return center;
    }
}
