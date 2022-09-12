package com.flight.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.service.model.Passenger;
import com.flight.service.service.PassengerService;

@Controller
public class PassengerUIController {
	@Autowired
    private PassengerService passengerService;

    @GetMapping("/booking/{passengerId}")
    public String getPassengerByPnrRest(@PathVariable Integer passengerId, Model model){

        Passenger passenger = passengerService.getPassengerById(passengerId);
        model.addAttribute("passenger", passenger);
        return "passengerdetails";
    }

    @GetMapping("/bookingnumber")
    public String getPassengerByPnr(@RequestParam("searchbar") Integer passengerId, Model model){
        if(passengerId <= 0) {
            List<Passenger> passenger = passengerService.getPassenger();
            model.addAttribute("passenger", passenger);
        } else {
            Passenger passenger = passengerService.getPassengerById(passengerId);
            model.addAttribute("passenger", passenger);
        }
        return "passengerdetails";
    }

    @PostMapping("/addpassenger")
    public String savePassenger(@ModelAttribute Passenger passenger) {

        this.passengerService.savePassenger(passenger);
        return "addpassenger";
    }

    @GetMapping("/login")
    public String goToLogin() {

        return "login";
    }

    @GetMapping("/registerpassenger")
    public String registerPassenger() {
        return "registerpassenger";
    }
}
