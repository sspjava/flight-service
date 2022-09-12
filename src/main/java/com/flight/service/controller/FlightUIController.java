package com.flight.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.flight.service.model.Flight;
import com.flight.service.service.FlightService;

@Controller
public class FlightUIController {
	@Autowired
    private FlightService flightService;

    @GetMapping("/showflights")
    public String getAllFlights(Model model) {

        List<Flight> listOfFlights = this.flightService.getAllFlights();
        System.out.println(listOfFlights);
        model.addAttribute("listOfFlights", listOfFlights);
        return "showflights";
    }
}
