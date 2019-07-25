package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.Booking;

public interface BookingService {
    Booking addBooking(Booking booking);

    Booking updateBooking(long bookingId, Booking booking);
}
