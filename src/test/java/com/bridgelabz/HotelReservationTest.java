package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservationSystem hotelReservation = new HotelReservationSystem();

    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotel() {
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "Regular", 110, 90)));
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("Bridgewood", "Regular",150, 50 )));
        Assert.assertTrue(hotelReservation.addHotel(new Hotel("Ridgewood", "Regular", 220, 150)));
    }

    @Test
    public void toFindTheCheapestHotel() {
        HotelReservationSystem cheapHotel = new HotelReservationSystem();
        cheapHotel.findCheapestHotel();
    }
    @Test
    public void toFindTheCheapestHotel_OnWeekdayAndWeekend() {
        HotelReservationSystem cheapHotel = new HotelReservationSystem();
        cheapHotel.findCheapestHotel_Weekday_Weekend();
    }

}