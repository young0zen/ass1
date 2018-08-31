package world;

import java.util.ArrayList;
import java.util.List;

public class Board {
    Robot robot;
    List<Obstacle> obstacles;
    BoxConfig boxConfig;
    RobotConfig robotConfig;
    Board(Robot robot,  List<Obstacle> obs) {
        this.robot = robot;
        obstacles = obs;
        boxConfig = new BoxConfig(obs);
        robotConfig = new RobotConfig(robot);
    }


}
