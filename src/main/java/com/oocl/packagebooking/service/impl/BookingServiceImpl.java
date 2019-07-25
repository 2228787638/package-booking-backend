package com.oocl.packagebooking.service.impl;

import com.oocl.packagebooking.model.Booking;
import com.oocl.packagebooking.repository.BookingRepository;
import com.oocl.packagebooking.service.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
    @Override
    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(long bookingId, Booking booking) {
        Booking newBooking = bookingRepository.findById(bookingId).get();
        BeanUtils.copyProperties(booking,newBooking,"id");
        bookingRepository.save(newBooking);
        return newBooking;
    }

}
