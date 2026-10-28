/**
 * Week 5 test program for a simulated four-motor tank drivetrain.
 * In Week 6, we'll turn this into a proper Drivetrain object.
 */
public class Drivetrain {
    public static void main(String[] args) {
        Motor leftLeader = new Motor("Left Leader");
        Motor leftFollower = new Motor("Left Follower");
        Motor rightLeader = new Motor("Right Leader");
        Motor rightFollower = new Motor("Right Follower");

        String name = "Maxam";
        String name2 = "Maxam";
        System.out.println(name.equals(name2));

        // TODO (Part 2): Create a Motor[] array containing all four motors.

        // TODO (Part 2): Use a for loop to print each motor's status.

        // TODO (Part 3): Simulate forward, backward, left turn, and stop.
        // Make follower speeds match their leaders each time.
        // Print all four motor speeds after each movement.

        // TODO (Part 4): Construct an Intake and test its methods.
    }
}
