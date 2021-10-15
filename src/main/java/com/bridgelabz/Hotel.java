package com.bridgelabz;
/**
 * Purpose - Implementation of setters and getters
 */
public class Hotel {
    private String hotelName;
    private String customerType;
    private int hotelRegularRate;
    private int hotelWeekendRate;
    private int hotelStarRating;
    private int rewardCustomerWeekdayRate;
    private int rewardCustomerWeekendRate;


    public Hotel(String hotelName,String customerType, int hotelRegularRate,int hotelWeekendRate, int hotelStarRating){
        this.hotelName = hotelName;
        this.customerType = customerType;
        this.hotelRegularRate = hotelRegularRate;
    }

    public String getHotelName(){
        return hotelName;
    }

    public void setHotelName(String hotelName){
        this.hotelName = hotelName;
    }

    public String getCustomerType(){
        return customerType;
    }

    public void setCustomerType(String customerType){
        this.customerType = customerType;
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

    public int getHotelStarRating(){
        return hotelStarRating;
    }

    public void setHotelStarRating(int hotelStarRating){
        this.hotelStarRating = hotelStarRating;
    }
}