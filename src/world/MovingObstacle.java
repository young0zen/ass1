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
        return new Point(getx() - t, gety() - t);
    }

    @Override
    public Point topRight() {
        double t = width / 2;
        return new Point(getx() + t, gety() + t);
    }

    private void moveTo(double x, double y) {
        setCenter(new Point(x, y));
    }

    public void move(Direction dir, double distance) {

        switch(dir) {
            case up:
                moveTo(getx(), gety() + distance);
                break;
            case down:
                moveTo(getx(), gety() - distance);
                break;
            case left:
                moveTo(getx() - distance, gety());
                break;
            case right:
                moveTo(getx() + distance, gety());
                break;
            default:
                break; /*NOT REACHED*/
        }

    }

}
