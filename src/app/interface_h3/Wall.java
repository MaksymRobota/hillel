package app.interface_h3;

import app.interface_h3.impl.IObstacle;
import app.interface_h3.impl.IParticipant;

class Wall implements IObstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(IParticipant participant) {
        return participant.jump(height);
    }
}
