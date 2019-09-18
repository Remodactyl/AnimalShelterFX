package main.java;

import java.time.LocalDateTime;

public abstract class Animal {
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public String Name;


    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }
    public Gender gender;

    public void setReservedBy(Reservor reservedBy) {
        ReservedBy = reservedBy;
    }

    public Reservor getReservedBy() {
        return ReservedBy;
    }
    public Reservor ReservedBy;



    public Animal(String name, Gender gender) {
        this.Name = name;
        this.gender = gender;
    }

    public boolean Reserve(String reservedBy) {
        if (this.ReservedBy == null) {
            this.ReservedBy = new Reservor(reservedBy, LocalDateTime.now());
            return true;
        }
        return false;
    }

    public String ToString() {
        String reserved = "not reserved";
        if (this.ReservedBy != null) {
            reserved = "reserved by {this.ReservedBy.Name}";
        }
        return this.Name + "," + this.gender + reserved;
    }
}
