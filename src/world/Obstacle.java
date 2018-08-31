package world;



abstract public class Obstacle {
    protected Point center;

    public Obstacle(double x, double y) {
        center.x = x;
        center.y = y;
    }

    abstract public boolean collideWith(Obstacle o);

    abstract public boolean isMovable();

    abstract public Point bottomLeft();

    abstract public Point topRight();
}
