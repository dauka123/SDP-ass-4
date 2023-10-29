public class Speedometer implements CarObserver {
    public void update(CarState state) {
        System.out.println("Speed: " + state.getSpeed() + " km/h");
    }
}