package main.java;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Dog extends Animal {
    public LocalDateTime LastWalk;
    public boolean NeedsWalk;

    public boolean getNeedsWalk() {
        return (LastWalk.until(LocalDateTime.now(), ChronoUnit.DAYS)) > 0;
    }
    public Dog(String name, Gender gender) {
        super(name, gender);
        this.LastWalk = LocalDateTime.now();
    }
    public String ToString() {
        return super.ToString() + ", last walk: " + this.LastWalk.toString();
    }
}
