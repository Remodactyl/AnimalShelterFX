package main.java;

public class Cat extends Animal {
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

    public String ToString() {
        return super.ToString() + ", bad habits: " + this.BadHabits.toLowerCase();
    }
}