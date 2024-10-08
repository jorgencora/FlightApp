package com.encora.flightapp.models;

import io.swagger.client.model.Dictionaries;
import io.swagger.client.model.Segment;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

@Data
@NoArgsConstructor
public class FlightInfo {

    String id;

    String carrier;
    String operatedBy;

    String flightNumber;

    LocalDateTime depDate;
    LocalDateTime arrDate;

    String depAirport;
    String arrAirport;

    String duration;


    public FlightInfo(Segment seg, Map<String,AirportDictionaryItem> airportDict, Dictionaries dicts){
        id = seg.getId();


        if(dicts.getCarriers().get(seg.getCarrierCode()) == null){
            carrier = seg.getCarrierCode();
        }
        else{
            carrier = dicts.getCarriers().get(seg.getCarrierCode()) + " (" + seg.getCarrierCode() +")";
        }

        if(seg.getOperating() == null){
            operatedBy = null;
        }
        else if(dicts.getCarriers().get(seg.getOperating().getCarrierCode()) == null){
            operatedBy = dicts.getCarriers().get(seg.getOperating().getCarrierCode());
        }
        else {
            operatedBy = dicts.getCarriers().get(seg.getOperating().getCarrierCode()) + " (" + seg.getOperating().getCarrierCode() +")";
        }



        if(dicts.getAircraft().get(seg.getNumber()) == null){
            flightNumber = seg.getNumber();
        }
        else {
            flightNumber = dicts.getAircraft().get(seg.getNumber());
        }

        depDate = seg.getDeparture().getAt();
        arrDate = seg.getArrival().getAt();

        if(airportDict.get(seg.getDeparture().getIataCode()) == null){
            depAirport = seg.getDeparture().getIataCode();
        }
        else{
            depAirport = airportDict.get(seg.getDeparture().getIataCode()).getCity() + " (" + seg.getDeparture().getIataCode() +")";

        }

        if(airportDict.get(seg.getArrival().getIataCode()) == null){
            arrAirport = seg.getArrival().getIataCode();
        }
        else{
            arrAirport = airportDict.get(seg.getArrival().getIataCode()).getCity() + " (" + seg.getArrival().getIataCode() +")";

        }

        duration = seg.getDuration();



    }

}
