public class CarState {
    private String engineStatus;
    private int speed;

    public CarState(String engineStatus, int speed) {
        this.engineStatus = engineStatus;
        this.speed = speed;
    }

    public String getEngineStatus() {
        return engineStatus;
    }

    public int getSpeed() {
        return speed;
    }
}