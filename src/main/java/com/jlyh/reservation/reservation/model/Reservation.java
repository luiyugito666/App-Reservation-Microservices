package com.jlyh.reservation.reservation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter @Setter @ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="reservation_id")
    private long reservationId;

    @Column(name="room_id")
    private long roomId;

    @Column(name="start_dt")
    private Date startDt;

    @Column(name="finish_dt")
    private Date finishDt;
}
