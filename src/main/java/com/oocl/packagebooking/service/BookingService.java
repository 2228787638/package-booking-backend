package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.Booking;

import java.util.List;

public interface BookingService {
    Booking addBooking(Booking booking);

    Booking updateBooking(long bookingId, Booking booking);

    /**
     * 根据订单状态查询订单
     * @param status 状态码
     * @return 订单列表
     */
    public List<Booking> seachBookingByStatus(int status);
}
