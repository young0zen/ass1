package world;



abstract public class Obstacle {
    private Point center;

    public Obstacle(double x, double y) {
        center.x = x;
        center.y = y;
    }

    abstract public boolean collideWith(Obstacle o);

    abstract public boolean isMovable();

    abstract public Point bottomLeft();

    abstract public Point topRight();

    public Point getCenter() {
        return center;
    }

    public double getx() {
        return center.x;
    }

    public double gety() {
        return center.y;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
