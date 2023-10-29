public class SedanCarFactory implements CarFactory {
    public Car createCar() {
        Car car = new Car();
        car.addObserver(new Speedometer());
        car.addObserver(new EngineStatusDisplay());
        return car;
    }
}
