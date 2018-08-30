package world;

//square
public class MovingObstacle extends Obstacle {
    public double width;

    MovingObstacle(double x, double y, double width) {
        super(x, y);
        this.width = width;
    }

    @Override
    public boolean collideWith(Obstacle o) {
        return true;
    }

    @Override
    public boolean isMovable() { return true; }

    @Override
    public Point bottomLeft() {
        double t = width / 2;
        return new Point(center.x - t, center.y - t);
    }

    @Override
    public Point topRight() {
        double t = width / 2;
        return new Point(center.x + t, center.y + t);
    }
}
