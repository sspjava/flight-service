package com.flight.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.service.entity.FlightEntity;
import com.flight.service.model.Flight;
import com.flight.service.repository.FlightRepository;

//@Service
//public interface FlightServiceImpl {
//	@Autowired
//    private FlightRepository flightRepository;
//
//    public List<Flight> getAllFlights() {
//
//        Iterable<FlightEntity> flightEntity = this.flightRepository.findAll();
//        List<Flight> listOfFlights = new ArrayList<>();
//        for(FlightEntity flight : flightEntity) {
//            Flight flights = new Flight();
//            flights.setFlightNo(flight.getFlightNo());
//            flights.setFlightModel(flight.getFlightModel());
//            flights.setCarrierName(flight.getCarrierName());
//            flights.setSeatCapacity(flight.getSeatCapacity());
//
//
//            listOfFlights.add(flights);
//        }
//        return listOfFlights;
//    }
//}
@Service
public class FlightServiceImpl implements FlightService{


    @Autowired
    private FlightRepository flightRepository;


    public List<Flight> getAllFlights() {


        Iterable<FlightEntity> flightEntity = this.flightRepository.findAll();
        List<Flight> listOfFlights = new ArrayList<>();
        for(FlightEntity flight : flightEntity) {
            Flight flights = new Flight();
            flights.setFlightNo(flight.getFlightNo());
            flights.setFlightModel(flight.getFlightModel());
            flights.setCarrierName(flight.getCarrierName());
            flights.setSeatCapacity(flight.getSeatCapacity());




            listOfFlights.add(flights);
        }
        return listOfFlights;
    }
}

