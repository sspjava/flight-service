package com.flight.service.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.service.model.Passenger;
import com.flight.service.service.PassengerService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
public class PassengerController {


    @Autowired
    private PassengerService passengerService;
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }




    @GetMapping( "/{passengerId}" )
    @ResponseBody
    public Passenger getPassenger(@PathVariable Integer passengerId) {
        return this.passengerService.getPassengerById(passengerId);
    }




    @GetMapping("/passengers")
    @ResponseBody
    public List<Passenger> getPassenger() {
        return this.passengerService.getPassenger();
    }




    @PostMapping("/save/passenger")
    @ResponseBody
    public boolean savePassenger(@RequestBody Passenger passenger) {


        this.passengerService.savePassenger(passenger);


        return true;
    }


    @GetMapping( {"/pass/{source}", "/pass" })
    @ResponseBody
    public List<Passenger> getPassengers(@PathVariable(required = false) Optional<String> source) {
        List<Passenger> passengersList =  new ArrayList<Passenger>();


        passengersList.add(new Passenger(2045,"Mohit Sen", 28, "MALE", "Bangalore", "Udaipur" ));
        passengersList.add(new Passenger(8135,"Rohit Sen", 24, "MALE", "Udaipur", "Ahemdabad" ));
     //   if(!((Object) source).isPresent())
            return passengersList;
     //   return passengersList.stream().filter(passnger -> passnger.getSource().equalsIgnoreCase(((Object) source).get())).collect(Collectors.toList());
    }
}

