package com.gridnine.testing;

import java.time.Duration;
import java.util.List;

public class FlightFilterMoreThen2HoursOnLand implements FlightFilter{

    public boolean segmentCheck(Flight flight) {
        List<Segment> segments = flight.getSegments();
        for(int i = 0; i < segments.size()-1; i++){
            Duration duration = Duration.between(segments.get(i).getArrivalDate(),segments.get(i+1).getDepartureDate());
            if(duration.toHours() >= 2){
                return false;
            }
        }
        return true;
    }
}
