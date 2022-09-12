package com.flight.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.service.model.Booking;
import com.flight.service.model.Passenger;
import com.flight.service.service.BookingService;
import com.flight.service.service.PassengerService;


@Controller
public class BookingUIController {
	@Autowired
    private BookingService bookingService;
    @Autowired
    private PassengerService passengerService;

    @GetMapping("/")
    public String getLandingPage(){
        return "index";
    }

    @GetMapping("/index")
    public String getLandingIndexPage(){
        return "index";
    }

    @GetMapping("/booking")
    public String getBookingPage(Model model){
        List<Passenger> passengerList = this.passengerService.getPassenger();
        model.addAttribute("passengerDetails", passengerList);
        return "bookflight";
    }

    @PostMapping("/bookingflight")
    public String saveBooking(@ModelAttribute("booking") Booking booking) {
        this.bookingService.saveBooking(booking);
        return "saved";
    }

    @GetMapping("/showbooking")
    public String getPassengerByPnr(@RequestParam("showbook") Long bookingId, Model model){
        if(bookingId <= 0) {
            List<Booking> booking = bookingService.getAllBookings();
            model.addAttribute("bookingDetails", booking);
        } else {
            Booking booking = bookingService.getBooking(bookingId);
            model.addAttribute("bookingDetails", booking);
        }
        return "showbooking";
    }
}
