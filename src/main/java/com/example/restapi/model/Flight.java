package com.example.restapi.model;

public class Flight {
	
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;
    private String aircraftId;
    // Getters and Setters
    // Constructor, toString, equals, and hashCode methods
	public Object getDepartureAirport() {
		return this.departureAirport;
	}
	public Object getAircraftId() {
		return this.aircraftId;
	}
	public String getArrivalAirport() {
		return this.arrivalAirport;
	}
}