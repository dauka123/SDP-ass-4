import java.util.ArrayList;
import java.util.List;
public class Car {
    private List<CarObserver> observers = new ArrayList<>();
    private CarState state;

    public void addObserver(CarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (CarObserver observer : observers) {
            observer.update(state);
        }
    }
    public void updateCarState(CarState newState) {
        state = newState;
        notifyObservers();
    }
}