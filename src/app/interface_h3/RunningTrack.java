package app.interface_h3;


import app.interface_h3.impl.IObstacle;
import app.interface_h3.impl.IParticipant;

class RunningTrack implements IObstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(IParticipant participant) {
        return participant.run(length);
    }
}