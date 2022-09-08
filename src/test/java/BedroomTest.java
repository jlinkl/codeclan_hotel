import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    ArrayList<Guest> guests;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("James");
        guests = new ArrayList<Guest>();
        guests.add(guest);
        bedroom = new Bedroom(guests, RoomType.SINGLE, 1, 10);
    }

    @Test
    public void bedroomHasVariables() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
        assertEquals(1, bedroom.getRoomNumber());
        assertEquals(guests, bedroom.getGuestList());
    }
}
