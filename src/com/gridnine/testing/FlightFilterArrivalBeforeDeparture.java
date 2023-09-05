package com.gridnine.testing;

public class FlightFilterArrivalBeforeDeparture implements FlightFilter{

    public boolean segmentCheck(Flight flight) {
        for (Segment segment : flight.getSegments()) {
            if (segment.getDepartureDate().isBefore(segment.getArrivalDate())) {
                return false;
            }
        }
        return true;
    }
}
