package com.edocti.jnext.spring.mvc;

public class Vehicle {
    private String vehicleNo;
    private String color;
    private int    wheel;
    private int    seat;


    public Vehicle(String vehicleNo, String color, int wheel, int seat) {
        this.vehicleNo = vehicleNo;
        this.color = color;
        this.wheel = wheel;
        this.seat = seat;
    }


    public Vehicle() {
        seat = 5;
        wheel = 4;
    }


    public String getVehicleNo() {
        return vehicleNo;
    }


    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getWheel() {
        return wheel;
    }


    public void setWheel(int wheel) {
        this.wheel = wheel;
    }


    public int getSeat() {
        return seat;
    }


    public void setSeat(int seat) {
        this.seat = seat;
    }
    
    public void update(Vehicle other){
    	seat = other.seat;
    	wheel = other.wheel;
    	color = other.color;
    	
    }
}
