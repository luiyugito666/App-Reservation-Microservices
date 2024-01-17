package com.jlyh.reservation.reservation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.jlyh.reservation.reservation.config.ReservationServiceConfiguration;
import com.jlyh.reservation.reservation.model.PropertiesReservation;
import com.jlyh.reservation.reservation.model.Reservation;
import com.jlyh.reservation.reservation.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ReservationController {
    @Autowired
    private IReservationService reservationService;

    @Autowired
    private ReservationServiceConfiguration configReservation;

@GetMapping("/reservations")
    public List<Reservation> getAllReservation(){
        return reservationService.getAllReservation();
    }

    @GetMapping("/reservations/read/properties")
    public String getPropertiesReservation() throws JsonProcessingException{
    ObjectWriter owj=new ObjectMapper().writer().withDefaultPrettyPrinter();
        PropertiesReservation propertiesReservation = new PropertiesReservation(configReservation.getMsg(), configReservation.getBuildVersion(),configReservation.getMailDetails());
        String jsonString = owj.writeValueAsString(propertiesReservation);
        return jsonString;



    }



}
