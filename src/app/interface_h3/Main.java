// Create a basic interface for a geometric figure, which has a method that returns the area of the figure.
// Create 3 classes that implement this interface: circle, triangle, square.
// Create an array of shapes, and write a method that displays the total area of all shapes in this array
// 1. Create a data type “Participant” and several of its implementations: Man, Cat, Robot.
// 2. The classes from p.2 should have the behavior of running and jumping (methods just output information about the action to the console).
// 3. Create an Obstacle data type and several implementations: Treadmill and Wall.
// 4. The classes from step 3 should have the behavior overcome.
// 5. Establish interaction between the Participant and the Obstacle.
// In other words, participants should perform appropriate actions (run or jump) when passing through the obstacle.
// For example: A person ran on a treadmill.
// 6. Create two arrays: one with participants and one with obstacles.
// 7. Each element in the participant array must pass each obstacle in the obstacle array.
// 8. * The obstacles have a length (for a track) or a height (for a wall), and the participants are limited to running and jumping.
// If a participant fails to pass one of the obstacles, he/she does not proceed to the next one (he/she is completely eliminated from the series of obstacles).
// 9. * Display the result of the participant's performance of a particular obstacle in the console. For example: “Participant [NAME] has passed the obstacle [NAME] at the distance [VALUE]”
// “Participant [NAME] did not pass the obstacle [NAME] at the distance [VALUE]. Passed [VALUE]”
// Translated with DeepL.com (free version)

package app.interface_h3;

import app.interface_h3.impl.IObstacle;
import app.interface_h3.impl.IParticipant;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        IParticipant[] participants = {
            new Human("Alex", 1000, 2),
            new Cat("Meow", 500, 3),
            new Robot("Wheelie", 1500, 1)
        };

        IObstacle[] obstacles = {
            new RunningTrack(400),
            new Wall(2)
        };

        for (IParticipant participant : participants) {
            boolean isEliminated = Arrays.stream(obstacles)
                    .anyMatch(obstacle -> !obstacle.overcome(participant));

            if (isEliminated) {
                System.out.println(participant.getName() + " вибув з участі.");
            }
        }
    }
}