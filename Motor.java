/**
 * Represents one motor in a simulated FRC robot.
 * Speeds range from -100 (reverse) to +100 (forward).
 */
public class Motor {
    
    String name;
    double speed;

    public Motor(String name) {
        this.name = name;
        this.speed = 0;
    }

    /** Set the motor speed, limiting it to the range -100 to 100. */
    public void setSpeed(double newSpeed) {
        // TODO: Use if / else if / else to limit newSpeed to [-100, 100],
        // then update this motor's speed.
    }

    /** Stop the motor. */
    public void stop() {
        // TODO: Set speed to zero.
    }

    /** Print the motor's name and its current speed. */
    public void printStatus() {
        // TODO: Print something like: Left Leader: 50.0%
    }
}
