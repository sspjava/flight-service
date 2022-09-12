package com.flight.service.service;

import java.util.List;

import com.flight.service.model.Passenger;

public interface PassengerService {
	boolean savePassenger(Passenger passenger);
    List<Passenger> getPassenger();

    Passenger getPassengerById(Integer id);
    void deletePassenger(Integer id);
}
