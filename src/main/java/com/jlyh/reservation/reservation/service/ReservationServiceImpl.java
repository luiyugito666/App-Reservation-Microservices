package com.jlyh.reservation.reservation.service;

import com.jlyh.reservation.reservation.dao.IReservationDao;
import com.jlyh.reservation.reservation.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationServiceImpl implements IReservationService{

    @Autowired
    private IReservationDao serviceDao;
    @Override
    public List<Reservation> getAllReservation() {
        return (List<Reservation>) serviceDao.findAll();
    }
}
