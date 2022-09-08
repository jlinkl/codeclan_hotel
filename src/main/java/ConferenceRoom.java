import java.util.ArrayList;

public class ConferenceRoom extends Room{
    private int roomNumber;
    private String roomName;

    public ConferenceRoom(int capacity, ArrayList<Guest> guestList, int roomNumber, String roomName) {
        super(capacity, guestList);
        this.roomNumber = roomNumber;
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }
}
