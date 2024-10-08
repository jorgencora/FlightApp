package com.encora.flightapp.models;

import io.swagger.client.model.Dictionaries;
import io.swagger.client.model.FlightOffer;
import io.swagger.client.model.Itineraries;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class FlightDetails {

    String id;

    List<SegmentInfo> segments;

    PriceInfo priceInfo;


    public FlightDetails(FlightOffer offer, Map<String,AirportDictionaryItem> airportDict, Dictionaries dicts){

        id = offer.getId();

        segments = new ArrayList<>();

        for(Itineraries it: offer.getItineraries()){

            segments.add(new SegmentInfo(it, offer.getTravelerPricings(), airportDict, dicts));

        }

        priceInfo = new PriceInfo(offer.getPrice(), offer.getTravelerPricings());


    }


}
