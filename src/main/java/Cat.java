import java.io.Serializable;

public class Cat extends Animal implements Serializable{
    private static final long serialVersionUID = 6128016096756071380L;
    public String BadHabits;

    public void setBadHabits(String badHabits) {
        BadHabits = badHabits;
    }

    public String getBadHabits() {
        return BadHabits;
    }

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        this.BadHabits = badHabits;
    }
    @Override
    public String toString() {
        return super.toString() + ", bad habits: " + this.BadHabits.toLowerCase();
    }
}