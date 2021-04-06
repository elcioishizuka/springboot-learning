package com.github.elcioishizuka.learningspring.data.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String reservationId;

//    @OneToOne
//    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ROOM_ID")
    @Column(name = "ROOM_ID")
    private Long roomId;

//    @ManyToOne
//    @JoinColumn(name = "GUEST_ID", referencedColumnName = "GUEST_ID")
    @Column(name = "GUEST_ID")
    private Long guestId;

    @Column(name = "RES_DATE")
    private Date reservationDate;

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
