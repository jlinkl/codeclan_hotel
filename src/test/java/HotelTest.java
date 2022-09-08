import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Guest guest;
    ArrayList<Guest> guests;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom;
    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Guest guest1;
    ArrayList<Guest> guests1;
    DiningRoom diningRoom;
    HashMap<String, DiningRoom> diningRooms;

    @Before
    public void before() {
        guest = new Guest("James");
        guests = new ArrayList<>();
        guests.add(guest);
        conferenceRoom = new ConferenceRoom(1, guests, 1, "room");
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);


        guest1 = new Guest("James");
        guests1 = new ArrayList<>();
        guests1.add(guest1);
        bedroom = new Bedroom(guests1, RoomType.DOUBLE, 1, 10);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom);

        diningRoom = new DiningRoom(2, guests, "The Dining Room");
        diningRooms = new HashMap<>();
        diningRooms.put(diningRoom.getRoomName(), diningRoom);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

    @Test
    public void hasBedRooms() {
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void canAddguestToBedroom() {
        Guest guest1 = new Guest("Jacob");
        guests = new ArrayList<>();
        bedroom = new Bedroom(guests, RoomType.DOUBLE, 1, 5);
        hotel.checkGuestIntoBedroom(guest1, bedroom);
        guests.add(guest1);
        assertEquals(guests, bedroom.getGuestList());
    }

    @Test
    public void canCheckOutGuests() {
        hotel.checkOutGuestBedroom(guest1, bedroom);
        guests1.remove(guest1);
        assertEquals(guests1, bedroom.getGuestList());
    }

    @Test
    public void canBookIn() {
        Booking booking = new Booking(bedroom, 5);
        hotel.bookRoom(bedroom, 5);
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasCost() {
        Booking booking = new Booking(bedroom, 5);
        assertEquals(50, booking.getCost());

    }

    @Test
    public void hasDiningRooms() {
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    @Test
    public void canCalculateSize() {
        assertEquals(2.0, bedroom.calculateSize(1.0, 2.0), 0.0);

    }

    @Test
    public void returnsEmptyRooms() {
        guests = new ArrayList<>();
        bedroom = new Bedroom(guests, RoomType.DOUBLE, 1, 10);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
        assertEquals(bedrooms, hotel.findEmptyRooms());

    }
}
