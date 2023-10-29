import java.util.ArrayList;
import java.util.List;

public class University {
    List<IObserver> observers = new ArrayList<>();

    public void CurrentWeather(Weather weather){
        notifyObservers(weather);
    }

    public void addStudent(Student student){
        this.observers.add(student);
    }

    public void removeStudent(Student student){
        this.observers.remove(student);
    }

    public void notifyObservers(Weather weather){
        for (IObserver observer: observers) {
            observer.update(weather);
        }
    }
}
