public class EngineStatusDisplay implements CarObserver {
    public void update(CarState state) {
        System.out.println("Engine Status: " + state.getEngineStatus());
    }
}
