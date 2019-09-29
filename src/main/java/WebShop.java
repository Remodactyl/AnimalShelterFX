

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    List<Animal> animals = new ArrayList<Animal>();
    List<Reservation> reservations = new ArrayList<Reservation>();
    List<Observer> observers = new ArrayList<Observer>();

    public void Attach(Observer observer) {
        this.observers.add(observer);
    }
    public void Notify() {
        for (Observer observer : observers) {
            observer.Update();
        }
    }
    public void AddAnimal(Animal animal) {
        this.animals.add(animal);
        Notify();
    }
    public void ReserveAnimal(Animal animal, String reservator) {

        if(reservator != null) {
            animal.Reserve(reservator);
        }
        Notify();
    }





}
