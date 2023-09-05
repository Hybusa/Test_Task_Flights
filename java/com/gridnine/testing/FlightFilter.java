package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

public interface FlightFilter {
    default List<Flight> filterFlights (List<Flight> flightList){
        return flightList.parallelStream()
                .filter(this::segmentCheck)
                .collect(Collectors.toList());
    }
    boolean segmentCheck(Flight flight);
}
