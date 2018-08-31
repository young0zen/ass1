package world;

//square
public class MovingObstacle extends Obstacle {
    private double width;

    public MovingObstacle(double x, double y, double width) {
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

    private void moveTo(double x, double y) {
        center.x = x;
        center.y = y;
    }

    public void move(Direction dir, double distance) {

        switch(dir) {
            case up:
                moveTo(center.x, center.y + distance);
                break;
            case down:
                moveTo(center.x, center.y - distance);
                break;
            case left:
                moveTo(center.x - distance, center.y);
                break;
            case right:
                moveTo(center.x + distance, center.y);
                break;
            default:
                break; /*NOT REACHED*/
        }

    }

}
