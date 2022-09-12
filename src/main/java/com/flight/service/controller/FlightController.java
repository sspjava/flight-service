package com.flight.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.service.model.Flight;
import com.flight.service.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
	@Autowired
    private FlightService flightService;
    @GetMapping("/")
    public List<Flight> getAllFlights() {
        return this.flightService.getAllFlights();
    }
}
