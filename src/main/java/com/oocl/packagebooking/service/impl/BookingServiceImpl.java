package com.oocl.packagebooking.service.impl;

import com.oocl.packagebooking.model.Booking;
import com.oocl.packagebooking.repository.BookingRepository;
import com.oocl.packagebooking.service.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
    @Override
    public Booking addBooking(Booking booking) {
        booking.setStatus(3);
        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(long bookingId, Booking booking) {
        Booking newBooking = bookingRepository.findById(bookingId).get();
        BeanUtils.copyProperties(booking,newBooking,"id","recipient","phoneNumber");
        bookingRepository.save(newBooking);
        return newBooking;
    }

    @Override
    public List<Booking> seachBookingByStatus(int status) {
        if(status==0){
            return bookingRepository.findAll();
        }else {
            return bookingRepository.findAll().stream().filter(i -> i.getStatus() == status).collect(Collectors.toList());
        }
    }


}
