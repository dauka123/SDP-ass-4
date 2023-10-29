public class SUVCarFactory implements CarFactory {
    public Car createCar() {
        Car car = new Car();
        car.addObserver(new Speedometer());
        car.addObserver(new GPSNavigator());
        return car;
    }
}