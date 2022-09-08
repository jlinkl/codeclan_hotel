import java.util.ArrayList;

public class Bedroom extends Room{
    private RoomType roomType;
    private int roomNumber;
    private int rate;

    public Bedroom(ArrayList<Guest> guestList, RoomType roomType, int roomNumber, int rate) {
        super(roomType.getCapacity(), guestList);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.rate = rate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getRate() {
        return rate;
    }

}
