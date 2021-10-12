package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

/**
 * Purpose - To build a Hotel Reservation System
 * Author - Sachin kore
 * @version - 16.0
 * @since - 2021-10-12
 */

public class HotelReservation {
    private  final List<Hotel> hotels;

    public static void main(String[] args) {
        System.out.println("Welcome To Hotel Reservation");
    }
    public HotelReservation() {
        this.hotels = new ArrayList<>();
    }

    /**
     * Purpose : Method to add hotels details to the Hotel List
     * @return the hotel details
     */
    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }
}
