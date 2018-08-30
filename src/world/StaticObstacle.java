package world;

public class StaticObstacle extends Obstacle {
    Point bottomLeft;
    Point topRight;

    StaticObstacle(Point bottomLeft, Point topRight) {
        super((bottomLeft.x + topRight.x) / 2, (bottomLeft.y + topRight.y) / 2);
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    StaticObstacle(double x1, double y1, double x2, double y2) {
        super((x1 + x2) / 2, (y1 + y2) / 2);
        bottomLeft = new Point(x1, y1);
        topRight = new Point(x2, y2);
    }

    @Override
    public boolean collideWith(Obstacle o) {
        return true;
    }

    @Override
    public boolean isMovable() { return false; }

    @Override
    public Point bottomLeft() {
        return bottomLeft;
    }

    @Override
    public Point topRight() {
        return topRight;
    }
}
