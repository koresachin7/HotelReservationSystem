package com.bridgelabz;
/**
 * Purpose - Implementation of setters and getters
 */
public class Hotel {
    private String hotelName;
    private int hotelRegularRate;
    private int hotelWeekendRate;

    public Hotel(String hotelName,int hotelRegularRate,int hotelWeekendRate){
        this.hotelName = hotelName;
        this.hotelRegularRate = hotelRegularRate;
        this.hotelWeekendRate = hotelWeekendRate;
    }

    public String getHotelName(){
        return hotelName;
    }

    public void setHotelName(String hotelName){
        this.hotelName = hotelName;
    }

    public int getHotelRegularRate(){
        return hotelRegularRate;
    }

    public void setHotelRegularRate(int hotelRegularRate){
        this.hotelRegularRate = hotelRegularRate;
    }

    public int getHotelWeekendRate(){
        return hotelWeekendRate;
    }

    public void setHotelWeekendRate(int hotelWeekendRate){
        this.hotelWeekendRate = hotelWeekendRate;
    }
}