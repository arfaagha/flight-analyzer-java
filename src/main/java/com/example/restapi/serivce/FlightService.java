package com.example.restapi.serivce;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restapi.model.Flight;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class FlightService {

    public List<Flight> getAllFlights() throws IOException {
        FileReader reader = new FileReader("flights.csv");
        return new CsvToBeanBuilder<Flight>(reader)
                .withType(Flight.class)
                .build()
                .parse();
    }
}
