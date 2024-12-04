package app.interface_h3;

import app.interface_h3.impl.IParticipant;

public class Human implements IParticipant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробіг " + distance + " метрів.");
            return true;
        }
        System.out.println(name + " не зміг пробігти " + distance + " метрів.");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перестрибнув " + height + " метрів.");
            return true;
        }
        System.out.println(name + " не зміг перестрибнути " + height + " метрів.");
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
