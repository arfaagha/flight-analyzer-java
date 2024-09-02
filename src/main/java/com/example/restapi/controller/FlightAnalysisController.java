
package com.example.restapi.controller;

import com.example.restapi.model.Flight;
import com.example.restapi.serivce.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/flights/analyze")
public class FlightAnalysisController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/inconsistencies")
    public List<Flight> getInconsistentFlights() throws IOException {
        List<Flight> flights = flightService.getAllFlights();
        Map<String, String> previousArrivalMap = new HashMap<>();
        List<Flight> inconsistentFlights = new ArrayList<>();

        for (Flight flight : flights) {
            String previousArrival = previousArrivalMap.get(flight.getAircraftId());
            if (previousArrival != null && !flight.getDepartureAirport().equals(previousArrival)) {
                inconsistentFlights.add(flight);
            }
            previousArrivalMap.put((String) flight.getAircraftId(), flight.getArrivalAirport());
        }

        return inconsistentFlights;
    }
}
