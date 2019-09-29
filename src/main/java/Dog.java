import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Dog extends Animal implements Serializable {
    private static final long serialVersionUID = 6128016096756071380L;
    public LocalDateTime LastWalk;
    public boolean NeedsWalk;

    public boolean getNeedsWalk() {
        return (LastWalk.until(LocalDateTime.now(), ChronoUnit.DAYS)) > 0;
    }
    public Dog(String name, Gender gender) {
        super(name, gender);
        this.LastWalk = LocalDateTime.now();
    }
    @Override
    public String toString() {
        return super.toString() + ", last walk: " + this.LastWalk.toString();
    }
}
