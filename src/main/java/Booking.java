import java.util.ArrayList;

public class Booking {
    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getCost() {
        return bedroom.getRate() * this.nights;
    }
}
