import java.util.ArrayList;

public class DiningRoom extends Room {
    private String roomName;

    public DiningRoom(int capacity, ArrayList<Guest> guestList, String roomName) {
        super(capacity, guestList);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
