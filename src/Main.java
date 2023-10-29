public class Main {
    public static void main(String[] args) {
        CarFactory sedanCarFactory = new SedanCarFactory();
        Car sedanCar = sedanCarFactory.createCar();

        CarFactory suvCarFactory = new SUVCarFactory();
        Car suvCar = suvCarFactory.createCar();

        sedanCar.updateCarState(new CarState("Running", 100));
        suvCar.updateCarState(new CarState("Stopped", 0));
    }
}
