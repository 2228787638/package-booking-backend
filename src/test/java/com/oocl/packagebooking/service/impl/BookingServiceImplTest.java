package com.oocl.packagebooking.service.impl;

import com.oocl.packagebooking.model.Booking;
import com.oocl.packagebooking.service.BookingService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.awt.print.Book;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingServiceImplTest {
    @Autowired
    BookingService bookingService;
    @Test
    public void should_return_a_new_Booking_by_addBooking() {
        Booking booking =new Booking("sdad");
        Booking reBooking = bookingService.addBooking(booking);
        Assert.assertEquals(booking.getRecipient(),reBooking.getRecipient());
    }

    @Test
    public void should_return_a_new_Booking_when_update_Booking_by_id() {
        Booking updateBooking=bookingService.updateBooking(1,new Booking(Long.parseLong("1"),Long.parseLong("1"),"1",1,Long.parseLong("1")));
        Assert.assertEquals(1,updateBooking.getStatus());
    }

    @Test
    public void should_return_BookingsList_according_to_status_id() {
        Booking booking = new Booking(Long.parseLong("1"),Long.parseLong("1"),"1",1,Long.parseLong("1"));
        List<Booking> bookingList = bookingService.seachBookingByStatus(1);
        Assert.assertEquals(1,bookingList.size());
    }

}
