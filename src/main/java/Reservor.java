package main.java;

import java.time.LocalDateTime;

public class Reservor {
    private String Name;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    private LocalDateTime ReservedAt;
    public LocalDateTime getReservedAt() {
        return ReservedAt;
    }
    public void setReservedAt(LocalDateTime reservedAt) {
        ReservedAt = reservedAt;
    }

    public Reservor(String name, LocalDateTime reservedAt) {
        this.setName(name);
        this.setReservedAt(reservedAt);
    }




}