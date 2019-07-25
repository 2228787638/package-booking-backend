package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Booking;
import com.oocl.packagebooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookings")
    @ResponseBody
    public Booking addBooking(@RequestBody Booking booking){
        return bookingService.addBooking(booking);
    }

    @PutMapping("/bookings/{bookingId}")
    @ResponseBody
    public Booking updateBooking(@PathVariable long bookingId,@RequestBody Booking booking){
        return bookingService.updateBooking(bookingId,booking);
    }

}
