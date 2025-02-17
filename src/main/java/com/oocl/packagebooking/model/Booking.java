package com.oocl.packagebooking.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    private long id;

    private String recipient;

    private long phoneNumber;

    private int status;

    private long time;

    public Booking() {
    }

    public Booking(String recipient) {
        this.recipient = recipient;
    }

    public Booking(long id, long phoneNumber, String recipient, int status, long time) {
        this.id = id;
        this.recipient = recipient;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.time = time;
    }

    public Booking(String recipient, long phoneNumber, int status, long time) {
        this.recipient = recipient;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
