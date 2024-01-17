package com.jlyh.reservation.reservation.dao;

import com.jlyh.reservation.reservation.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationDao extends CrudRepository<Reservation,Long> {
}
