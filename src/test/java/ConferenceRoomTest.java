import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    ArrayList<Guest> guests;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("James");
        guests = new ArrayList<Guest>();
        guests.add(guest);
        conferenceRoom = new ConferenceRoom(1, guests, 1, "room");
    }

    @Test
    public void hasVariables() {
        assertEquals(1, conferenceRoom.getCapacity());
        assertEquals(guests, conferenceRoom.getGuestList());
        assertEquals(1, conferenceRoom.getRoomNumber());
        assertEquals("room", conferenceRoom.getRoomName());
    }


}
