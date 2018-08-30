package world;

abstract public class Obstacle {
    Point center;

    Obstacle(double x, double y) {
        center.x = x;
        center.y = y;
    }

    abstract public boolean collideWith(Obstacle o);

    abstract boolean isMovable();

    abstract Point bottomLeft();

    abstract Point topRight();
}
