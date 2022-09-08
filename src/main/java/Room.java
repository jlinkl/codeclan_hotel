import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guestList;

    public Room(int capacity, ArrayList<Guest> guestList) {
        this.capacity = capacity;
        this.guestList = guestList;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public static double calculateSize(double length, double width) {
        return length * width;
    }

}
