import java.io.Serializable;
import java.time.LocalDateTime;

public class Reservor implements Serializable {
    private static final long serialVersionUID = 6128016096756071380L;
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

    @Override
    public String toString() {
        return this.Name;
    }




}