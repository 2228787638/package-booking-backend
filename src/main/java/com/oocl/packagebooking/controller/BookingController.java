package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Booking;
import com.oocl.packagebooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
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
    @GetMapping("/bookings")
    @ResponseBody
    public List<Booking> seachBookingByStatus(@RequestParam(value = "status",defaultValue = "0")int status){
        return bookingService.seachBookingByStatus(status);
    }

}
