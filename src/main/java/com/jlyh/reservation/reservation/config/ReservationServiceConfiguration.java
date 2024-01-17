package com.jlyh.reservation.reservation.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
@Configuration
@ConfigurationProperties(prefix="reservation")
@Data
public class ReservationServiceConfiguration {

    private String msg;
    private String buildVersion;
    private Map<String,String> mailDetails;

}
