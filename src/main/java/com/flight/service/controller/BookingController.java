package com.flight.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.service.model.Booking;
import com.flight.service.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	 @Autowired
	    private BookingService bookingService;

	    @GetMapping("/")
	    public List<Booking> getAllBookings() {

	        return this.bookingService.getAllBookings();
	    }
	}

