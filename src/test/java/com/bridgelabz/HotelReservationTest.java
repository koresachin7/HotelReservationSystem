package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    void givenHotelDetails_WhenAddedHotelDetails_ShouldReturnHotelDetails() {
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Lakewood", 110)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Bridgewood", 160)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Ridgewood", 220)));
    }
}