import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void checkGuestIntoBedroom(Guest guest, Bedroom bedroom) {
        if (this.findEmptyRooms().contains(bedroom)) {
            bedroom.guestList.add(guest);
        }

    }

    public void checkOutGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.guestList.remove(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, nights);
        return booking;
    }

    public ArrayList<Bedroom> findEmptyRooms() {
        ArrayList<Bedroom> emptyRooms = new ArrayList<>();
        for (Bedroom room: this.bedrooms) {
            if (room.getGuestList().isEmpty()) {
                emptyRooms.add(room);
            }
        }
        return emptyRooms;
    }
}
