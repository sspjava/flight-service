package com.flight.service.exception;

public class BookingNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public BookingNotFoundException(String msg) {
        super(msg);
    }

}
