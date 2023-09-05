package com.gridnine.testing;

public class FlightFilterArrivalBeforeDeparture implements FlightFilter{

    public boolean segmentCheck(Flight flight) {
        for (Segment segment : flight.getSegments()) {
            if (segment.getArrivalDate().isBefore(segment.getDepartureDate())) {
                return false;
            }
        }
        return true;
    }
}
