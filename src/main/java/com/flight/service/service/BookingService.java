package com.flight.service.service;

import java.util.List;

import com.flight.service.model.Booking;

public interface BookingService {
	public List<Booking> getAllBookings();
    public String saveBooking(Booking booking);

    public Booking getBooking(Long id);
}
