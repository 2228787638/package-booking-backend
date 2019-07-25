package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
