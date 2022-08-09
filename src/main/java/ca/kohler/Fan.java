package ca.kohler;

public class Fan {
    protected String description;
    protected int speed;
    protected boolean direction;

    //constructors
    public Fan() {
    }

    public Fan(String description) {
        this.description = description;
    }

    //getters & setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    //methods
    public void pullSpeedCord() {
        speed = (speed + 1) % 3;
    }

    public void pullDirectionCord() {
        //assumption: false = clockwise / true = counterclockwise
        direction = (direction) ? false : true;
    }

    public void displayFanStatus() {
        System.out.println("Description: " + getDescription()
                + "\nDirection: " + (direction ? "Counterclockwise" : "Clockwise")
                + "\nSpeed: " + getSpeed());
    }
}
