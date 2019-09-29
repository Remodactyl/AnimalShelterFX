public interface Subject {
    void Attach(Observer observer);

    void Notify();
}
