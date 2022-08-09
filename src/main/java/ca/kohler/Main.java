package ca.kohler;

public class Main {
    public static void main(String[] args) {
        Fan ceilingFan = new Fan("Ceiling Fan");

        ceilingFan.displayFanStatus(); //-> S:0 | D:Clockwise

        ceilingFan.pullDirectionCord();
        ceilingFan.pullSpeedCord();
        ceilingFan.displayFanStatus(); //-> S:1 | D:Counterclockwise

        ceilingFan.pullDirectionCord();
        ceilingFan.pullSpeedCord();
        ceilingFan.displayFanStatus(); //-> S:2 | D:Clockwise

        ceilingFan.pullDirectionCord();
        ceilingFan.pullSpeedCord();
        ceilingFan.displayFanStatus(); //-> S:0 | D:Counterclockwise
    }
}
