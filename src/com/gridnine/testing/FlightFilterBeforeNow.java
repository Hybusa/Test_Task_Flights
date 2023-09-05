package com.gridnine.testing;

import java.time.LocalDateTime;

public class FlightFilterBeforeNow implements FlightFilter {

    public boolean segmentCheck(Flight flight) {
        for (Segment segment : flight.getSegments()) {
            if (segment.getDepartureDate().isBefore(LocalDateTime.now())) {
                return false;
            }
        }
        return true;
    }
}
